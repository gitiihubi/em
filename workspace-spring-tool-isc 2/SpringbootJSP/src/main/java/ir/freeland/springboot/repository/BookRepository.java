package ir.freeland.springboot.repository;

import java.util.Collection;
import java.util.Optional;

import ir.freeland.springboot.repository.model.BookData;


public interface BookRepository {
    Collection<BookData> findAll();

    Optional<BookData> findById(String isbn);

    BookData add(BookData book);
}
