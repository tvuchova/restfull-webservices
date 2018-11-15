package com.example.users.userportal.domain;

import com.example.users.userportal.domain.dto.BookDto;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class BookEntity {

  @Id
  @GeneratedValue
  private Long id;

  public BookEntity(String name, UserEntity userEntity) {
    this.name = name;
    this.userEntity = userEntity;
  }

  // TODO lenght,
  // TODO mail validation
  @Column()
  private String name;


  @ManyToOne
  private UserEntity userEntity;

  @Column()
  private String author;

  public BookEntity(Long id, String name, UserEntity userEntity, String author) {
    this.id = id;
    this.name = name;
    this.userEntity = userEntity;
    this.author = author;
  }

  public BookEntity() {
  }

  public static BookEntity of(BookDto bookDto){
    BookEntity bookEntity = new BookEntity();
    bookEntity.setName(bookDto.getName());
    return bookEntity;
  }


  public UserEntity getUserEntity() {
    return userEntity;
  }

  public void setUserEntity(UserEntity userEntity) {
    this.userEntity = userEntity;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


}
