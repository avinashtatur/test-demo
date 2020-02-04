package com.demo.demo.controller;

import com.demo.demo.service.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
public class demoController {
    @Autowired
    Demo demo;

    @RequestMapping("/")
    public String index() {
        return demo.hollowWorld();
    }

    @RequestMapping("/get-email")
    public List<String> getEmail() {
        return demo.getEmail();
    }
}
