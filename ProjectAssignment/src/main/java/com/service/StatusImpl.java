package com.service;

import com.models.StatusClass;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("database3")
public class StatusImpl implements StatusService{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<StatusClass> getWithStatus() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<StatusClass> statusList=session.createNativeQuery("SELECT COUNT(internId) AS number FROM internAssignment GROUP BY status").list();
        transaction.commit();
        session.close();
        return statusList;
    }

    @Override
    public List<StatusClass> getForParticularIntern() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<StatusClass> statusList=session.createNativeQuery("select internId,SUM(remarks) as TotalMarks from internAssignment group by internid ").list();
        transaction.commit();
        session.close();
        return statusList;
    }

}
