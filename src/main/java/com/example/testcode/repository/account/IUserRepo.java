package com.example.testcode.repository.account;

import com.example.testcode.model.account.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<Users, Integer> {
    Users findByUserName(String userName);
}
