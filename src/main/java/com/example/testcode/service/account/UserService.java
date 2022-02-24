package com.example.testcode.service.account;

import com.example.testcode.model.account.Users;
import com.example.testcode.model.account.UserPrinciple;
import com.example.testcode.repository.account.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    IUserRepo iUserRepo;

    @Override
    public Users save(Users users) {
        return iUserRepo.save(users);
    }

    @Override
    public List<Users> findAll() {
        return iUserRepo.findAll();
    }

    @Override
    public Users findByUserName(String userName) {
        return iUserRepo.findByUserName(userName);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = iUserRepo.findByUserName(username);
        if (users == null) {
            throw new UsernameNotFoundException(username);
        }
        return UserPrinciple.build(users);
    }
}
