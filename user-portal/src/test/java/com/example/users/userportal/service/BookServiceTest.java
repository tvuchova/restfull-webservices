package com.example.users.userportal.service;


import com.example.users.userportal.domain.dto.BookDto;
import com.example.users.userportal.repository.BookRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {

  @Mock
  private BookRepository mockBookRepository;

  private BookService bookService;

  @Before
  public void setUp() {
    this.bookService = new BookService(mockBookRepository);
  }

  @Test
  public void addBook() {

    //
    bookService.addBook(new BookDto());
  }

  @Test
  public void searchBooks() {
  }
}