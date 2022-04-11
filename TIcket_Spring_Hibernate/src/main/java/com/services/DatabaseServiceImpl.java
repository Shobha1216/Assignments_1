package com.services;

import com.models.Ticket;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("database")
public class DatabaseServiceImpl  implements TicketService{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Ticket> getTickets() {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        List<Ticket> ticketList=session.createQuery("from Ticket",Ticket.class).list();
        transaction.commit();
        session.close();
        return ticketList;
    }

    @Override
    public Ticket getTicketById(int ticketId) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Ticket ticket =session.get(Ticket.class,ticketId);
        transaction.commit();
        session.close();
        return ticket;
    }

    @Override
    public String createTicket(Ticket ticket) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(ticket);
        try {
            transaction.commit();
        }catch (Exception e){
            return "unable to create Ticket";
        }
        session.close();
        return  "Successfully created Ticket";
    }

    @Override
    public String updateTicket(Ticket ticket) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.update(ticket);
        try {
            transaction.commit();
        }catch (Exception e){
            return "unable to update Ticket";
        }
        session.close();
        return  "Successfully Updated";

    }

    @Override
    public String deleteTicket(Ticket ticket) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.delete(ticket);
        try {
            transaction.commit();
        }catch (Exception e){
            return  "unable to delete Ticket";
        }
        session.close();
        return  "Ticket successfully deleted";
    }



}
