package com.dream.controller;

import com.dream.representation.common.result.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/")
    public Object indexMethod() {
        return Result.success().setData("ok");
    }
}
