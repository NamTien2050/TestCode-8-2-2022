package com.example.testcode.service.domainData;

import com.example.testcode.model.DomainData;
import com.example.testcode.model.dto.DomainDataDTO;
import com.example.testcode.repository.IDomainDataRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DomainDataService implements IDomainDataService {
    @Autowired
    private IDomainDataRepo iDomainDataRepo;

    @Override
    public List<DomainDataDTO> getAllDomain(Integer parentId) {
        List<DomainDataDTO> dtoList = new ArrayList<>();
        List<DomainData> domainDataList = iDomainDataRepo.getAllDomain(parentId);
        if (domainDataList.size() > 0) {
            for (DomainData data : domainDataList) {
                DomainDataDTO domainDataDTO = new DomainDataDTO();
                BeanUtils.copyProperties(data, domainDataDTO);
                dtoList.add(domainDataDTO);
            }
        }
        return dtoList;
    }

    @Override
    public DomainData findById(int id) {
        return iDomainDataRepo.findById(id).get();
    }
}
