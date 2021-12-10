package com.example.project.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Salaries implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String user_id;

    @Column
    private String department;

    @Column
    private String name;

    @Column
    private String email;

    @Column(nullable = false)
    private String salary;

    public Salaries(String user_id, String department, String name, String email, String salary) {
        this.user_id = user_id;
        this.department = department;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Integer getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Salaries() {
    }
}

