package com.example.testcode.repository;

import com.example.testcode.model.DomainData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDomainDataRepo extends JpaRepository<DomainData, Integer> {

}
