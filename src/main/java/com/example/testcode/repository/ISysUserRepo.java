package com.example.testcode.repository;

import com.example.testcode.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface ISysUserRepo extends JpaRepository<SysUser, Integer> {
    SysUser findByLoginName(String userName);
}
