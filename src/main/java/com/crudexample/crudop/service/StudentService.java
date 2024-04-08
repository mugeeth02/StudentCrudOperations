package com.crudexample.crudop.service;

import com.crudexample.crudop.exception.ResourceNotFoundException;
import com.crudexample.crudop.model.Registration;
import com.crudexample.crudop.repository.JpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    JpaRepo jpa;

    public Registration addData(Registration regi){
        return this.jpa.save(regi);
    }

    public List<Registration> getAllRecords(){
        return this.jpa.findAll();
    }

    public Optional<Registration> getRecord(Integer id){
        return this.jpa.findById(id);
    }

    public Registration updateRecord(Integer id,Registration regi){
        Registration oldRecords = this.jpa.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("User Data Not Found"));
        oldRecords.setName(regi.getName());
        oldRecords.setDept(regi.getDept());
        oldRecords.setAddress(oldRecords.getAddress());
        return this.jpa.save(oldRecords);
    }

    public String deleteRecords(Integer sid){
        this.jpa.deleteById(sid);
        return "Successfully Deleted";
    }
}
