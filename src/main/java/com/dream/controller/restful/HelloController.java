package com.dream.controller.restful;

import com.dream.representation.common.result.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("helloController")
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public Object indexMethod() {
        return Result.success().setData("ok");
    }
}
