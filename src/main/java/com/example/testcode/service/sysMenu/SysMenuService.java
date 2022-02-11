package com.example.testcode.service.sysMenu;

import com.example.testcode.model.ResponseMenuRole;
import com.example.testcode.repository.ISysMenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuService implements ISysMenuService {
    @Autowired
    private ISysMenuRepo iSysMenuRepo;

    @Override
    public List<ResponseMenuRole> getSysMenu(int roleId) {
        return iSysMenuRepo.getSysMenu(roleId);
    }
}
