package com.lynxmind.demo.business.consultants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientDao clientDao;

    public List<Client> listConsultants() {
        return clientDao.findAll();
    }

    public Optional<Client> getClient(String id) {
        return clientDao.findById(id);
    }
}
