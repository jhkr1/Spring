package com.spring.spring.with.udemy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping("/login")
    public String gotoLoginPage(@RequestParam String name, ModelMap model) {
        model.put("name", name);
        logger.debug("RequestParam is {}", name);
        logger.info("I want this is Info Level RequestParam is {}", name);
        logger.warn("I want this is warn Level");
//        System.out.println("RequestParam is "+name); // 추천하지 않는 방식.
        return "login";
    }
}
