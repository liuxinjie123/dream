package com.dream.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("indexPageController")
public class IndexPageController {

    @RequestMapping("/")
    public String indexPage() {
        return "index";
    }
}
