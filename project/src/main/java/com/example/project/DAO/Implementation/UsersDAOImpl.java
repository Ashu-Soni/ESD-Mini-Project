package com.example.project.DAO.Implementation;

import com.example.project.DAO.UserDAO;
import com.example.project.bean.Users;
import com.example.project.util.HibernateSessionUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.Transaction;

public class UsersDAOImpl implements UserDAO {
    @Override
    public int login(Users user) {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction t = session.beginTransaction();

            String username=user.getUsername();
            String pass=user.getPassword();

            String hql="SELECT user_id FROM User Where name="+username+" and password="+pass;
            Query q=session.createQuery(hql);
            int id=(int) q.getSingleResult();

            t.commit();
            return id;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return -1;
        }
    }
}
