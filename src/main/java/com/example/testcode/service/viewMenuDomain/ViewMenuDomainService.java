package com.example.testcode.service.viewMenuDomain;

import com.example.testcode.model.ViewMenuDomain;
import com.example.testcode.model.dto.ViewMenuDomainDTO;
import com.example.testcode.repository.IViewMenuDomainRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ViewMenuDomainService implements IViewMenuDomainService {
    @Autowired
    private IViewMenuDomainRepo iViewMenuDomainRepo;

    @Override
    public List<ViewMenuDomainDTO> findByDomainDataList(Integer parentId, String code, String name) {
        List<ViewMenuDomainDTO> dtoList = new ArrayList<>();
        List<ViewMenuDomain> viewMenuDomainList = iViewMenuDomainRepo.findByDomainDataList(parentId, code, name);
        if (viewMenuDomainList.size() > 0)
            for (ViewMenuDomain data : viewMenuDomainList) {
                ViewMenuDomainDTO viewMenuDomainDTO = new ViewMenuDomainDTO();
                BeanUtils.copyProperties(data, viewMenuDomainDTO);
                dtoList.add(viewMenuDomainDTO);
            }
        return dtoList;
    }
}
