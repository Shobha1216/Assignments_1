package com.models;

import javax.persistence.*;

@Entity
@Table(name="`booktable`")
public class Book {

    @Id
    @Column(name="book_id")
    private  int bookId;

    @Column(name="book_name")
    private String bookName;

    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getBookId() {
        return bookId;
    }


    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
