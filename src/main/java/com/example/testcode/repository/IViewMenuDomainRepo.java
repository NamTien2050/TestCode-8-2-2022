package com.example.testcode.repository;

import com.example.testcode.model.ViewMenuDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IViewMenuDomainRepo extends JpaRepository<ViewMenuDomain, Integer> {
    @Query(value = "select * from vps_game_flatform.v_menu_domain " +
            "where parent_id = ?1 " +
            "or code = ?2 " +
            "or name = ?3 ",
            nativeQuery = true)
    List<ViewMenuDomain> findByDomainDataList(Integer parentId, String code, String name);

}
