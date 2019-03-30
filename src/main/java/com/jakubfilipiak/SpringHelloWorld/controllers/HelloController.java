package com.jakubfilipiak.SpringHelloWorld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jakub Filipiak on 30.03.2019.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "helloworld.html";
    }
}
