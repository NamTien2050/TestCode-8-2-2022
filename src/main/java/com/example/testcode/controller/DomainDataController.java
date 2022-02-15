package com.example.testcode.controller;

import com.example.testcode.model.DomainData;
import com.example.testcode.model.ResponObj;
import com.example.testcode.service.domainData.IDomainDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domain-data")
public class DomainDataController {
    @Autowired
    private IDomainDataService iDomainDataService;

    @GetMapping("/root-node")
    public ResponObj findAll() {
        return iDomainDataService.listDomainData();
    }


}
