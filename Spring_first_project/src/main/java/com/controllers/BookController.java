package com.controllers;

import com.models.Book;
import com.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    @Qualifier("database")
    private BookService bookService;

    public  BookController(){

        /*ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        bookService=context.getBean(BookService.class);*/
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Book> getBooks(){
        return bookService.getBooks();
    }


    @RequestMapping(value = "/{id}", method=RequestMethod.GET)
    public Book getBookById(@PathVariable("id") int bookId){
        return bookService.getBookById(bookId);
    }

    @RequestMapping(method= RequestMethod.POST)
    public Book createBook(@RequestBody Book book){
        bookService.createBook(book);
        return book;
    }



}
