package com.dream.controller.restful;

import com.dream.config.RedisConfig;
import com.dream.representation.common.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("helloController")
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @RequestMapping(method = RequestMethod.GET)
    public Object indexMethod() {
        stringRedisTemplate.opsForValue().set("hello", "hello jack");
        return Result.success().setData("ok");
    }
}
