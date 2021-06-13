package com.example.demo;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestApi {
    @RequestMapping("customers")
    public String test() {
        return "hello world";
    }
}
