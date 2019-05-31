package com.lynxmind.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultantsApi {

    @GetMapping("/hello")
    public String hello() {
        return "hello worldz";
    }

}
