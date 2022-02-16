package com.example.testcode.service.viewMenuRole;
import com.example.testcode.model.ViewMenuRole;
import com.example.testcode.repository.IViewMenuRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewMenuRoleService implements IViewMenuRoleService {
    @Autowired
    private IViewMenuRoleRepo iViewMenuRoleRepo;

    @Override
    public List<ViewMenuRole> getSysMenu(int roleId) {
        return iViewMenuRoleRepo.getSysMenu(roleId);
    }
}
