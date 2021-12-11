package com.example.project.DAO.Implementation;

import com.example.project.DAO.UserDAO;
import com.example.project.bean.SalaryDB;
import com.example.project.bean.Users;
import com.example.project.util.HibernateSessionUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.Transaction;

import java.util.List;

public class UsersDAOImpl implements UserDAO {
    @Override
    public int login(Users user) {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction t = session.beginTransaction();

            String username=user.getUsername();
            String password=user.getPassword();
            System.out.println(username+" "+password);

            Query q=session.createQuery("FROM Users WHERE username= :username and password=:pass");
            q.setParameter("username", username);
            q.setParameter("pass", password);
            List<Users> users= (List<Users>) q.list();

            t.commit();
            session.close();
            return users.get(0).getUser_id();
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return -1;
        }
    }

    @Override
    public Users getSalaryInfo(int u_id) {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction t = session.beginTransaction();

            System.out.println(u_id);
            Query q=session.createQuery("FROM Users WHERE user_id=:user_id");
            q.setParameter("user_id", u_id);
            System.out.println(q);
            Users user= (Users) q.list().get(0);

            t.commit();
            session.close();
            return user;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
    }
}
