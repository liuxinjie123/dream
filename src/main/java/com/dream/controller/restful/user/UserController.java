package com.dream.controller.restful.user;

import com.dream.api.user.UserService;
import com.dream.representation.common.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("userController")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/user")
    public Result helloMethod() {
        return Result.success().setData(userService.findAll());
    }
}
