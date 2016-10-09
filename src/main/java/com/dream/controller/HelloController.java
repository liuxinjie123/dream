package com.dream.controller;

import com.dream.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Object helloMethod() {
        User user = new User(), user2 = new User();
        return user;
    }
}
