package com.example.project.DAO;

import com.example.project.bean.Users;

public interface UserDAO {
    int login (Users user);
    public Users getSalaryInfo(String u_id);
}
