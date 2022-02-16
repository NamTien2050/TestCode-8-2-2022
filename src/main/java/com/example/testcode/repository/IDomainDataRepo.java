package com.example.testcode.repository;

import com.example.testcode.model.DomainData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDomainDataRepo extends JpaRepository<DomainData, Integer> {
    @Query(value = "select * from vps_game_flatform.domain_data " +
            "where (vps_game_flatform.domain_data.parent_id = ?1 or ?1 is null)", nativeQuery = true)
    List<DomainData> getAllDomain(Integer parentId);

    }
