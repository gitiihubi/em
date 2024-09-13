package ir.freeland.springboot.service;

import java.util.Collection;

import ir.freeland.springboot.dto.Book;


public interface BookService {
    Collection<Book> getBooks();
    Book addBook(Book book);
}