package com.example.users.userportal.domain.dto;

import com.example.users.userportal.domain.BookEntity;
import org.hibernate.validator.constraints.Length;

import java.util.Objects;

/**
 * Book DTO object, used only to expose some Book information via rest api.
 */
public class BookDto {


  // Min, Max,....
  @Length(max = 10)
  private Long bookId;
  private String name;

  public BookDto(@Length(max = 10) Long bookId, String name) {
    this.bookId = bookId;
    this.name = name;
  }

  public BookDto() {

  }

  /**
   * Construct
   * @param bookEntity
   * @return
   */
  public static BookDto of(BookEntity bookEntity) {
    Objects.requireNonNull(bookEntity);

    BookDto bookDto = new BookDto();
    bookDto.setName(bookEntity.getName());
    return bookDto;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public Long getBookId() {
    return bookId;
  }

  public void setBookId(Long bookId) {
    this.bookId = bookId;
  }

}
