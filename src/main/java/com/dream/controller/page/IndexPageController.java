package com.dream.controller.page;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("indexPageController")
@Slf4j
public class IndexPageController {

    @GetMapping(value = {"/", "/index"})
    public String indexPage() {
        log.info(" ---------------------- index page ------------------ ");
        return "index";
    }
}
