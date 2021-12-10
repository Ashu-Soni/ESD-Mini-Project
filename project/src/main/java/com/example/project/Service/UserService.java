package com.example.project.Service;

import com.example.project.DAO.Implementation.UsersDAOImpl;
import com.example.project.bean.Users;

public class UserService {
    UsersDAOImpl usersDAO = new UsersDAOImpl();

    public int login(Users user){
        return usersDAO.login(user);
    }
}