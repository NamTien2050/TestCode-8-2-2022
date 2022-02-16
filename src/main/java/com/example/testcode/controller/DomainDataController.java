package com.example.testcode.controller;

import com.example.testcode.model.ResponObj;
import com.example.testcode.model.dto.DomainDataDTO;
import com.example.testcode.model.dto.ViewMenuDomainDTO;
import com.example.testcode.service.domainData.IDomainDataService;
import com.example.testcode.service.viewMenuDomain.IViewMenuDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/domain-data")
public class DomainDataController {
    @Autowired
    private IDomainDataService iDomainDataService;
    @Autowired
    private IViewMenuDomainService iViewMenuDomainService;

    @GetMapping("/root-node")
    public ResponObj findAll(@RequestParam(required = false) Integer parentId) {
        List<DomainDataDTO> dataDTOList = iDomainDataService.getAllDomain(parentId);
        if (dataDTOList != null)
            return new ResponObj(200, "success", dataDTOList);
        return new ResponObj(207, "IP not found");
    }

    @GetMapping("/search-domain-data")
    public ResponObj findByDomainDataList(@RequestParam(required = false) Integer parentId,
                                          @RequestParam(required = false) String code,
                                          @RequestParam(required = false) String name) {
        List<ViewMenuDomainDTO> viewList = iViewMenuDomainService.findByDomainDataList(parentId, code, name);
        if (viewList != null)
            return new ResponObj(200, "success", viewList);
        return new ResponObj(207, "IP not found");
    }
}
