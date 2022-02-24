package com.example.testcode.service.account;

import com.example.testcode.model.account.Users;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {
    Users save(Users users);

    List<Users> findAll();
    Users findByUserName(String userName);
}
