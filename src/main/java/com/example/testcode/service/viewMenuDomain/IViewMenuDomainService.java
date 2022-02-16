package com.example.testcode.service.viewMenuDomain;

import com.example.testcode.model.dto.ViewMenuDomainDTO;

import java.util.List;

public interface IViewMenuDomainService {
    List<ViewMenuDomainDTO> findByDomainDataList (Integer parentId, String code, String name);
}
