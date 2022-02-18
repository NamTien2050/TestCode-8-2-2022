package com.example.testcode.service.sysMenu;

import com.example.testcode.model.SysMenu;
import com.example.testcode.model.dto.SysMenuDTO;
import com.example.testcode.repository.ISysMenuRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SysMenuService implements ISysMenuService {
    @Autowired
    private ISysMenuRepo iSysMenuRepo;

    @Override
    public List<SysMenuDTO> getAllBySysMenu(String code, String name, String url) {
        List<SysMenuDTO> dtoList = new ArrayList<>();
        List<SysMenu> sysMenuList = iSysMenuRepo.getAllBySysMenu(code, name, url);
        if (sysMenuList.size() > 0) {
            for (SysMenu data : sysMenuList) {
                SysMenuDTO sysMenuDTO = new SysMenuDTO();
                BeanUtils.copyProperties(data, sysMenuDTO);
                dtoList.add(sysMenuDTO);
            }
        }
        return dtoList;
    }

    @Override
    public SysMenu findById(int id) {
        return iSysMenuRepo.findById(id).get();
    }

    @Override
    public Boolean saveSysMenu(SysMenu newSysMenu) {
        SysMenu old = iSysMenuRepo.getById(newSysMenu.getSysMenuId());
        if (old == null) {
            iSysMenuRepo.save(newSysMenu);
            return true;
        } else {
            old.setSysMenuId(newSysMenu.getSysMenuId());
            old.setCode(newSysMenu.getCode());
            old.setName(newSysMenu.getName());
            old.setParentId(newSysMenu.getParentId());
            old.setSortOrder(newSysMenu.getSortOrder());
            old.setUrl(newSysMenu.getUrl());
            iSysMenuRepo.save(old);
            return false;
        }
    }

    @Override
    public boolean removeRole(int id) {
        SysMenu old = findById(id);
        if (old != null) {
            iSysMenuRepo.deleteById(id);
            return true;
        }
        return false;
    }

//    @Override
//    public List<SysMenu> getAllByCodes(String code) {
//        List<SysMenu> old = iSysMenuDTORepo.getAllByCodes(code);
//        if (old != null)
//            return
//    }

}
