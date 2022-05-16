package com.service;

import com.models.Intern;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("database")
public class InternServiceImpl implements InternService {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Intern> getAllInterns() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Intern> internList = session.createQuery("from Intern", Intern.class).list();
        transaction.commit();
        session.close();
        return internList;
    }

    @Override
    public Intern getInternById(String id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Intern intern = session.get(Intern.class, id);
        transaction.commit();
        session.close();
        return intern;
    }

    @Override
    public Intern createIntern(Intern intern) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(intern);
        transaction.commit();
        session.close();
        return intern;
    }

   /* @Override
    public int createIntern(Intern intern) {
        Session session= sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Integer i=(Integer) session.save(intern);
        transaction.commit();
        session.close();
        return i;
    }*/

    @Override
    public Intern updateIntern(Intern intern) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.update(intern);
        transaction.commit();
        session.close();
        return intern;
    }


    @Override
    public Intern deleteIntern(Intern intern) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.delete(intern);
        transaction.commit();
        session.close();
        return intern;
    }

    @Override
    public List<Intern> getInternsCount() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Intern> internList = session.createNativeQuery("select count(id) as count from intern").list();
        transaction.commit();
        session.close();
        return internList;
    }

@Override
    public Intern deleteInternById(String id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Intern intern1 = session.get(Intern.class, id);
        session.delete(intern1);
        transaction.commit();
        session.close();
        return intern1;
    }
}
