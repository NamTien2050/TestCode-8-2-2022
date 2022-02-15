package com.example.testcode.repository;

import com.example.testcode.model.SysMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testcode.model.dto.SysMenuDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISysMenuRepo extends JpaRepository<SysMenu, Integer> {
//    @Query(value = "select * from sys_menu where code = ?1", nativeQuery = true)
//    List<SysMenu> getAllByCodes(String code);

    @Query(value = "SELECT * FROM sys_menu " +
            "WHERE ( code = ?1 OR ?1 IS NULL ) " +
            "AND ( name = ?2 OR ?2 IS NULL  ) " +
            "AND ( url =?3 OR ?3 IS NULL)"
            , nativeQuery = true)
    List<SysMenu> getAllBySysMenu(String code, String name, String url);

    @Query(value = "SELECT * FROM sys_menu " +
            "WHERE ( code = ?1 OR ?1 IS NULL ) " +
            "AND ( name = ?2 OR ?2 IS NULL  ) " +
            "AND ( url =?3 OR ?3 IS NULL)", nativeQuery = true)
    List<SysMenu> getMenu(String code, String name, String url);

    @Query(value = "SELECT * FROM sys_menu " +
            "WHERE sys_menu_id = ?1", nativeQuery = true)
    SysMenu getBySys_menu_id(int sys_menu_id);
}
