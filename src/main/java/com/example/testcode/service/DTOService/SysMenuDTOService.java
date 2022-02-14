package com.example.testcode.service.DTOService;

import com.example.testcode.model.SysMenu;
import com.example.testcode.repository.ISysMenuDTORepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuDTOService implements ISysMenuDTOService {
    @Autowired
    private ISysMenuDTORepo iSysMenuDTORepo;

    @Override
    public List<SysMenu> getAllByCodes(String code) {
        List<SysMenu> old = iSysMenuDTORepo.getAllByCodes(code);
        if (old != null)
            return 
    }
}
