package com.example.testcode.repository;

import com.example.testcode.model.ViewMenuRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IViewMenuRoleRepo extends JpaRepository<ViewMenuRole, Integer> {
//    @Query(value = "SELECT sm.code FROM SysMenu sm " +
//            "left join role_menu rm on sm.sys_menu_id = rm.sys_menu_id  " +
//            "left JOIN sys_role sr on sr.sys_role_id = rm.sys_role_id WHERE sr.sys_role_id = :roleId ", nativeQuery = true)
//    List<SysMenuResponse> getSysMenu(@Param("roleId")int roleId);
    //@Query(value = "select")

//    @Query(value = "select sm.code from SysMenu sm join RoleMenu rm on sm.id = rm.sysMenuId join SysRole sr on sr.id = rm.sysRoleID where sr.id = ?1")
//    List<SysMenuResponse> getSysMenu(int id);

    @Query(value = "select v from ViewMenuRole v where v.sysRoleId = :id ")
    List<ViewMenuRole> getSysMenuRole(@Param("id") int id);
}
