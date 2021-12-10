package com.example.project.DAO;

import com.example.project.bean.SalaryDB;

import java.util.List;

public interface SalaryDBDAO {
    public List<SalaryDB> getSalaries(String u_id);
}
