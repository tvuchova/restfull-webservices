package com.example.users.userportal.controller;


import com.example.users.userportal.service.BookService;
import com.example.users.userportal.domain.dto.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/books")
public class BookController {


  @Autowired
  private BookService bookService;

  public void setBookService(BookService bookService) {
    this.bookService = bookService;
  }
  /*
  * Book has one or more BookCopyies
    This relation is represented as Set<BookCopy> inventory
    optiojal: Book is favorite of multiple Users.
            this will allow the service to show a UserEntity other Users with similar interests
    Book class is responsible for maintaining its inventory of copies.
that includes adding and removing copies.
it should be able to answer if there is an available copy for rental for given period
BookCopy getAvailable(Date start, Date end) will return null if there is no available copy
the actual rental operation is done on a BookCopy!
  * */
  //public BookController(BookService bookService) {
  //  this.bookService = bookService;
  //}

  /**
   * ffff
   */
   ///@PreAutorise()
  @PostMapping("book")
  public void addBookToStore(@Valid @RequestBody BookDto book) {

    // TODO validation
    bookService.addBook(book);
  }

  /*@GetMapping("books")
  public List<BookDto> searchBooks(){

    return bookService.searchBooks();
  }*/
}
