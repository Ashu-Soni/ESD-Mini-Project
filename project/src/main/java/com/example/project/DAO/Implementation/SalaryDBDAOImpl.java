package com.example.project.DAO.Implementation;

import com.example.project.DAO.SalaryDBDAO;
import com.example.project.bean.SalaryDB;
import com.example.project.util.HibernateSessionUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class SalaryDBDAOImpl implements SalaryDBDAO {

    @Override
    public List<SalaryDB> getSalaries(String u_id) {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction t = session.beginTransaction();

            String hql="FROM SalaryDB WHERE user_id="+u_id;
            Query q=session.createQuery(hql);
            List<SalaryDB> salaries= (List<SalaryDB>) q.getSingleResult();

            t.commit();
            session.close();
            return salaries;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
    }
}