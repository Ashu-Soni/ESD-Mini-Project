package com.example.project.Service;

import com.example.project.DAO.Implementation.UsersDAOImpl;
import com.example.project.bean.Users;

public class UserService {
    static UsersDAOImpl usersDAO = new UsersDAOImpl();

    public int login(Users user){
        return usersDAO.login(user);
    }

    public static Users getSalaryInfo(String u_id){
        return usersDAO.getSalaryInfo(u_id);
    }
}