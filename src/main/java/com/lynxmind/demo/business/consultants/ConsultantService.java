package com.lynxmind.demo.business.consultants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultantService {

    @Autowired
    ConsultantDao consultantDao;

    public List<Consultant> listConsultants() {
        return consultantDao.findAll();
    }

}
