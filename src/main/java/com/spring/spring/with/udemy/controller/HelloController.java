package com.spring.spring.with.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    @RequestMapping("say-hello-jsp")
//    @ResponseBody -> 문자열 sayHello를 반환
    public String sayHelloJsp() {
        return "sayHello";
    }
}
