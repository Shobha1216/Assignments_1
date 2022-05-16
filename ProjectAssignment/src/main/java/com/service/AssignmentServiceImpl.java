package com.service;

import com.models.Assignment;
import com.models.Intern;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("database1")
  public class AssignmentServiceImpl implements AssignmentService{


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Assignment> getAllAssignments() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Assignment> assignmentList=session.createQuery("from Assignment",Assignment.class).list();
        transaction.commit();
        session.close();
        return assignmentList;

    }
    @Override
    public Assignment getAssignmentById(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Assignment assignment = session.get(Assignment.class, id);
        transaction.commit();
        session.close();
        return assignment;
    }
    @Override
    public Assignment createAssignment(Assignment assignment) {
        Session session= sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(assignment);
        transaction.commit();
        session.close();
        return assignment;
    }

    @Override
    public Assignment updateAssignment(Assignment assignment) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.update(assignment);
        transaction.commit();
        session.close();
        return assignment;
    }

    @Override
    public Assignment deleteAssignment(Assignment assignment) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.delete(assignment);
        transaction.commit();
        session.close();
        return assignment;
    }

    @Override
    public List<Assignment> getAssignmentCount() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Assignment> assignmentList = session.createNativeQuery("select count(id) as count from assignment").list();
        transaction.commit();
        session.close();
        return assignmentList;
    }

    @Override
    public Object getAssignmentByName(String name) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createNativeQuery("select * from assignment where assignmentname=:name");
        query.setParameter("name",name);
        Object assignment =  query.uniqueResult();
        transaction.commit();
        session.close();
        return assignment;
    }
}
