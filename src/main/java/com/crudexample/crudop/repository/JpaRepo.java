package com.crudexample.crudop.repository;

import com.crudexample.crudop.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRepo extends JpaRepository<Registration,Integer> {
}
