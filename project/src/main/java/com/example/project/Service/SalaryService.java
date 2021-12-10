package com.example.project.Service;

import com.example.project.DAO.Implementation.SalaryDAOImpl;
import com.example.project.bean.Salaries;

public class SalaryService {
    static SalaryDAOImpl salaryDAO = new SalaryDAOImpl();

    public static Salaries getSalaryInfo(String u_id){
        return salaryDAO.getSalaryInfo(u_id);
    }
}
