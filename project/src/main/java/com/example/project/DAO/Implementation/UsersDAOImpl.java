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

            String hql="FROM UserInfo WHERE username="+"'"+username+"'";
            System.out.println(hql);
            Query q=session.createQuery(hql);
            List<Users> users= (List<Users>) q.list();

            System.out.println(users.get(0).getUser_id());

            t.commit();
            session.close();
            return users.get(0).getUser_id();
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return -1;
        }
    }

    @Override
    public Users getSalaryInfo(String u_id) {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction t = session.beginTransaction();

            String hql="FROM SalaryInfo WHERE user_id="+u_id;
            Query q=session.createQuery(hql);
            Users user= (Users) q.getSingleResult();

            t.commit();
            session.close();
            return user;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
    }
}
