package com.example.testcode.service.domainData;

import com.example.testcode.model.DomainData;
import com.example.testcode.model.dto.DomainDataDTO;

import java.util.List;

public interface IDomainDataService {
    List<DomainDataDTO> getAllDomain(Integer parentId);
    DomainData findById(int id);
}
