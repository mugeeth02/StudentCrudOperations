package com.crudexample.crudop.repository;

import com.crudexample.crudop.model.Registration;
import jakarta.persistence.NamedNativeQueries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface JpaRepo extends JpaRepository<Registration,Integer> {
  public void color(){

  }



}
