//package com.example.testcode.service.sysUser;
//
//import com.example.testcode.model.SysUser;
//import com.example.testcode.model.account.UserPrinciple;
//import com.example.testcode.repository.ISysUserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;

//@Service
//public class SysUserService implements ISysUserService {
//    @Autowired
//    private ISysUserRepo iSysUserRepo;
//
//    @Override
//    public void save(SysUser sysUser) {
//        iSysUserRepo.save(sysUser);
//    }
//
//    @Override
//    public Iterable<SysUser> findAll() {
//        return iSysUserRepo.findAll();
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        SysUser sysUser = iSysUserRepo.findByLoginName(userName);
//        if (sysUser == null)
//            throw new UsernameNotFoundException(userName);
//        return UserPrinciple.build(sysUser);
//    }
//}
