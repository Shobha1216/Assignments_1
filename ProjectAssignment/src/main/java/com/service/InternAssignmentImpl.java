package com.service;

import com.models.InternAssignment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("database2")
public class InternAssignmentImpl implements InternAssignmentService{

    @Autowired
    private SessionFactory sessionFactory;



    @Override
    public List<InternAssignment> getAllInternAssignments() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<InternAssignment> internAssignmentList=session.createQuery("from InternAssignment",InternAssignment.class).list();
        transaction.commit();
        session.close();
        return internAssignmentList;
    }

    @Override
    public List<InternAssignment> metrics() {
        Session session= sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<InternAssignment> metricList=session.createQuery("from InternAssignment i where 3>=(select count(distinct remarks))",InternAssignment.class).list();
        transaction.commit();
        session.close();
        return  metricList;
    }

    @Override
    public InternAssignment createInternAssignment(InternAssignment internAssignment) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(internAssignment);
        transaction.commit();
        session.close();
        return internAssignment;
    }

    @Override
    public InternAssignment updateInternAssignment(InternAssignment internAssignment) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.update(internAssignment);
        transaction.commit();
        session.close();
        return internAssignment;
    }

    @Override
    public InternAssignment deleteInternAssignment(InternAssignment internAssignment) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.delete(internAssignment);
        transaction.commit();
        session.close();
        return internAssignment;
    }

    @Override
    public List<InternAssignment> getIsComplete() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<InternAssignment> internAssignmentList=session.createQuery("from InternAssignment  i where i.status='isComplete'",InternAssignment.class).list();
        transaction.commit();
        session.close();
        return internAssignmentList;
    }

    @Override
    public List<InternAssignment> getIsPending() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<InternAssignment> internAssignmentList=session.createQuery("from InternAssignment  i where i.status='isPending'",InternAssignment.class).list();
        transaction.commit();
        session.close();
        return internAssignmentList;
    }

    @Override
    public List<InternAssignment> getIsReviewed() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<InternAssignment> internAssignmentList=session.createQuery("from InternAssignment  i where i.status='isReviewed'",InternAssignment.class).list();
        transaction.commit();
        session.close();
        return internAssignmentList;
    }


}

