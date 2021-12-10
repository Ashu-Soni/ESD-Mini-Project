package com.example.project.DAO.Implementation;

import com.example.project.DAO.SalaryDAO;
import com.example.project.bean.Salaries;
import com.example.project.util.HibernateSessionUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class SalaryDAOImpl implements SalaryDAO {

    @Override
    public Salaries getSalaryInfo(String u_id) {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction t = session.beginTransaction();

            String hql="FROM SalaryInfo WHERE user_id="+u_id;
            Query q=session.createQuery(hql);
            Salaries salary= (Salaries) q.getSingleResult();

            t.commit();
            session.close();
            return salary;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
    }
}
