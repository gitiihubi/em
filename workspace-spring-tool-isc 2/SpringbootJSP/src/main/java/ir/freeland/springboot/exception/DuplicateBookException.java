package ir.freeland.springboot.exception;

import ir.freeland.springboot.dto.Book;
import lombok.Getter;

@Getter
public class DuplicateBookException extends RuntimeException {
    private static final long serialVersionUID = -5392715218106411754L;
	private final Book book;

    public DuplicateBookException(Book book) {
        this.book = book;
    }
}