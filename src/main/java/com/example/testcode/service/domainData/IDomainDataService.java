package com.example.testcode.service.domainData;

import com.example.testcode.model.DomainData;

import java.util.List;

public interface IDomainDataService {
    List<DomainData> listDomainData();
    DomainData findById(int id);
}
