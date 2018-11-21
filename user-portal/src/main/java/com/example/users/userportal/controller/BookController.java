package com.example.users.userportal.controller;


import com.example.users.userportal.service.BookService;
import com.example.users.userportal.domain.dto.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {


  @Autowired
  private BookService bookService;

  public void setBookService(BookService bookService) {
    this.bookService = bookService;
  }

  /**
   * TO DO
   */
  @PostMapping("book")
  public void addBookToStore(@Valid @RequestBody BookDto book) {

    // TODO validation
    bookService.addBook(book);
  }

  @GetMapping("books")
  public List<BookDto> searchBooks(){

    return bookService.searchBooks();
  }
}
