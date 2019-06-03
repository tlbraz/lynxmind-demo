package com.lynxmind.demo.business.consultants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientsApi {

    @Autowired
    ClientService clientService;

    @GetMapping("/clients")
    public List<Client> hello() {
        return clientService.listConsultants();
    }

    @GetMapping("/clients/{id}")
    public ResponseEntity<Client> hello(@PathVariable(name = "id") String id) {
        return ResponseEntity.of(clientService.getClient(id));
    }

}
