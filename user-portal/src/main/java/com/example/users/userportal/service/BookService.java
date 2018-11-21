package com.example.users.userportal.service;


import com.example.users.userportal.domain.dto.BookDto;
import com.example.users.userportal.domain.BookEntity;
import com.example.users.userportal.repository.BookRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

/**
 * TO DO
 */
@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * TO DO
     *
     * @param book
     */
    @Transactional
    public void addBook(BookDto book) {

        Objects.requireNonNull(book);
        Objects.requireNonNull(book.getName(), "The name should not be null.");

        bookRepository.save(BookEntity.of(book));
    }

    /*public List<BookDto> searchBooks() {
        return bookRepository.searchSomething("Australlia")
                .stream()
                .map(BookDto::of).collect(Collectors.toList());
    }*/

}
