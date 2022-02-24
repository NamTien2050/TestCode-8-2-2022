package com.example.testcode.repository.account;

import com.example.testcode.model.account.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepo extends JpaRepository<Roles, Integer> {
    Roles findByUserName(String roleName);
}
