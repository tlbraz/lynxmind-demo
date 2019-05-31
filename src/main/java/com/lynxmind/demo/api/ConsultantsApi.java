package com.lynxmind.demo.api;

import com.lynxmind.demo.integration.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultantsApi {

    @Autowired
    Producer producer;

    @GetMapping("/hello")
    public String hello() {
        producer.sendMessage("top kek");
        return "hello worldz";
    }



}
