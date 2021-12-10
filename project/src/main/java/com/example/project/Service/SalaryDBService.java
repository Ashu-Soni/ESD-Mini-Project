package com.example.project.Service;

import com.example.project.DAO.Implementation.SalaryDBDAOImpl;
import com.example.project.bean.SalaryDB;

import java.util.List;

public class SalaryDBService {
    static SalaryDBDAOImpl SalaryDBDAO = new SalaryDBDAOImpl();

    public static List<SalaryDB> getSalaries(String u_id){
        return SalaryDBDAO.getSalaries(u_id);
    }
}
