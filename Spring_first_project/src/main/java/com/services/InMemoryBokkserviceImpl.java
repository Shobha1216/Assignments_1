package com.services;

import com.models.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class InMemoryBokkserviceImpl implements BookService {
  private List<Book> bookList=new ArrayList<>();

    @Override
    public List<Book> getBooks() {
        return bookList;
    }

    @Override
    public Book getBookById(int bookId) {
        for(int i=0;i<bookList.size();i++) {
            if (bookList.get(i).getBookId() == bookId) {
                return bookList.get(i);
            }

        }
        return null;
    }

    @Override
    public Book createBook(Book book) {
            bookList.add(book);
            return book;
    }

    @Override
    public Book updateBook(Book book) {
            for(int i=0;i<bookList.size();i++){
                if(bookList.get(i).getBookId()==book.getBookId()){
                    bookList.set(i,book);
                }
            }
            return null;
    }
}
