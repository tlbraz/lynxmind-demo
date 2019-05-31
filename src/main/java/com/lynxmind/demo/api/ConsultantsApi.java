package com.lynxmind.demo.api;

import com.lynxmind.demo.business.consultants.Consultant;
import com.lynxmind.demo.business.consultants.ConsultantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsultantsApi {

    @Autowired
    ConsultantService consultantService;

    @GetMapping("/hello")
    public List<Consultant> hello() {
        return consultantService.listConsultants();
    }



}
