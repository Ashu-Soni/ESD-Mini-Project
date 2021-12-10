package com.example.project.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer user_id;

    @Column(nullable = false)
    private String name;

    @Column
    private String department;

    @Column
    private int salary;

    public Users(Integer id, Integer user_id, String name, String department, int salary, String email, String password, String username) {
        this.id = id;
        this.user_id = user_id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.email = email;
        this.password = password;
        this.username = username;
    }

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String username;

    public Users() {
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
