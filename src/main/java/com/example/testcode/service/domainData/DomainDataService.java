package com.example.testcode.service.domainData;

import com.example.testcode.model.DomainData;
import com.example.testcode.repository.IDomainDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomainDataService implements IDomainDataService {
    @Autowired
    private IDomainDataRepo iDomainDataRepo;
    @Override
    public List<DomainData> listDomainData() {
        return iDomainDataRepo.findAll();
    }
}
