package com.services;

import com.models.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service("database")
public class DatabaseBookServiceImpl implements BookService {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Book> getBooks() {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        List<Book> bookList=session.createQuery("from Book",Book.class).list();
        transaction.commit();
        session.close();
        return bookList;

    }

    @Override
    public Book getBookById(int bookId) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Book book =session.get(Book.class,bookId);
        transaction.commit();
        session.close();
        return book;

    }

    @Override
    public Book createBook(Book book) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(book);
        transaction.commit();
        session.close();
        return  book;


    }

    @Override
    public Book updateBook(Book book) {
       return null;
    }
}
