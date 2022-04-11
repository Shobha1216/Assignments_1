package com.services;

import com.models.Book;

import java.util.List;


public interface BookService {
    List<Book> getBooks();

    Book getBookById(int bookId);

    Book createBook(Book book);

   Book updateBook(Book book);
}
