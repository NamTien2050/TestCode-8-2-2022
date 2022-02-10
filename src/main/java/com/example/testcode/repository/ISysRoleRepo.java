package com.example.testcode.repository;

import com.example.testcode.model.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISysRoleRepo extends JpaRepository<SysRole, Integer> {
    @Query(value = "SELECT sr FROM SysRole sr where lower(sr.code) like lower(concat('%',:search,'%'))" +
            "or lower(sr.name)like lower(concat('%',:search,'%') )"
    )
    List<SysRole> findSysRolesBy(@Param("search") String searchRole);

    @Query(value = "SELECT * FROM vps_game_flatform.sys_role", nativeQuery = true)
    List<SysRole> getAll();
}
