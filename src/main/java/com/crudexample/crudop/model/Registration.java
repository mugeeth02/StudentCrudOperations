package com.crudexample.crudop.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Student_Registration")
public class Registration {

@Id // primary key value setting
@GeneratedValue(strategy = GenerationType.SEQUENCE) //automatic value generation
@Column(name = "student_id") // customized column name
    private int student_id;
@Column(name = "student_name")
    private String name;
@Column(name = "department_name")
    private String dept;
@Column(name = "student_address")
    private String address;

    public int getId() {
        return student_id;
    }

    public void setId(int id) {
        this.student_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
