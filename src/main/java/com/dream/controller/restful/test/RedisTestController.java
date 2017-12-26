package com.dream.controller.restful.test;

import com.dream.representation.common.result.Result;
import com.dream.utils.RedisCacheUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("redisTestController")
@RequestMapping("/redis")
@Slf4j
public class RedisTestController {
    @Autowired
    private RedisCacheUtils cacheUtils;


    @PostMapping(value = "/{key}")
    public Result setString(@PathVariable("key") String key,
                            @RequestParam("value") String value,
                            @RequestParam(value = "time", required = false, defaultValue = "0") Long time) {
        log.info("---key={}, value={}, time={} ", key, value, time);
        if (time.intValue() == 0) {
            cacheUtils.set(key, value);
        } else {
            cacheUtils.set(key, value, time);
        }
        return Result.success().setData("ok");
    }

    @DeleteMapping(value = "/{key}")
    public Result delete(@PathVariable("key") String key) {
        cacheUtils.delete(key);
        return Result.success();
    }
}
