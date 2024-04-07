package com.crudexample.crudop.controller;

import com.crudexample.crudop.model.Registration;
import com.crudexample.crudop.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/homepage")
public class HomeController {
    @Autowired
    StudentService studentService;
    @PostMapping("/registration")
    public Registration addValues(@RequestBody Registration regi){
        return this.studentService.addData(regi);
    }

    @GetMapping("/getRecords")
    public List<Registration> getData(){
        return this.studentService.getAllRecords();
    }

    @GetMapping("/getParticularRecords/{id}")
    public Optional<Registration> getRecord(@PathVariable (value = "id") Integer identity){
        return this.studentService.getRecord(identity);
    }
    @PutMapping("/updateRecords/{id}")
    public Registration updateRec(@PathVariable (value = "id") Integer identity,
                                    @RequestBody Registration regi){
        return this.studentService.updateRecord(identity,regi);
    }

    @DeleteMapping("/deleteRecords/{sid}")
    public String DeleteRecords(@PathVariable (value = "sid") Integer stdid){
        return this.studentService.deleteRecords(stdid);
    }

}



