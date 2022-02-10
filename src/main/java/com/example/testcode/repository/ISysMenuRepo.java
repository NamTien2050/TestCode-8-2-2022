package com.example.testcode.repository;

import com.example.testcode.model.RoleMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISysMenuRepo extends JpaRepository<RoleMenu, Integer> {
    @Query(value = "select sys_menu.code from((role_menu\n" +
            "inner join sys_role on role_menu.sys_role_id = sys_role.sys_role_id)\n" +
            "inner join sys_menu on role_menu.sys_menu_id = sys_menu.sys_menu_id) where sys_role.code = :search ", nativeQuery = true)
    List<RoleMenu> getSysMenu(@Param("search")String searchRoleID);
    //@Query(value = "select")
}