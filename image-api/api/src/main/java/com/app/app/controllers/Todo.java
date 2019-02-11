package com.app.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Todo {
    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }
}
