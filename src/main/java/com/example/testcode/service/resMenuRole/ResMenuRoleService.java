package com.example.testcode.service.resMenuRole;
import com.example.testcode.model.ResponseMenuRole;
import com.example.testcode.repository.IResMenuRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResMenuRoleService implements IResMenuRoleService {
    @Autowired
    private IResMenuRoleRepo iResMenuRoleRepo;

    @Override
    public List<ResponseMenuRole> getSysMenu(int roleId) {
        return iResMenuRoleRepo.getSysMenu(roleId);
    }
}
