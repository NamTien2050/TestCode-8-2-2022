package com.example.testcode.service.viewMenuRole;

import com.example.testcode.model.SysMenu;
import com.example.testcode.model.ViewMenuRole;
import com.example.testcode.model.dto.SysMenuDTO;
import com.example.testcode.repository.IViewMenuRoleRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ViewMenuRoleService implements IViewMenuRoleService {
    @Autowired
    private IViewMenuRoleRepo iViewMenuRoleRepo;

    @Override
    public List<SysMenuDTO> getSysMenuRole(int roleId) {
        List<SysMenuDTO> dtoList = new ArrayList<>();
        List<ViewMenuRole> viewList = iViewMenuRoleRepo.getSysMenuRole(roleId);
        if (viewList.size() > 0) {
            for (ViewMenuRole data : viewList) {
                SysMenuDTO sysMenuDTO = new SysMenuDTO();
                BeanUtils.copyProperties(data, sysMenuDTO);
                dtoList.add(sysMenuDTO);
            }
        }
        return dtoList;
    }
}
