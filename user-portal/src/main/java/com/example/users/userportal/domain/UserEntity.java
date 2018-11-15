package com.example.users.userportal.domain;

import javax.persistence.*;
import java.awt.print.Book;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;



    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<BookEntity> books= new LinkedList<>();



    //user has favorite books
    //set<Book> favorites;

    //UserEntity has list of rented BookCopyies
    //Set<BookCopy> rentals
    //Each rental is valid for a time period.
    /*boolean favorite(Book book) will return true/false if operation succeeded
    boolean unFavorite(Book book) will return true/false if operation succeeded
    boolean rent(Book book) will return true/false if operation succeeded
    boolean return(Book book) will return true/false if operation succeeded*/

    public UserEntity() {
    }
    public UserEntity(String firstName, List<BookEntity> books) {
        this.firstName = firstName;
        this.books = books;
    }

    public UserEntity(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public List<BookEntity> getBooks() {
        return books;
    }


    public void setBooks(List<BookEntity> books) {
        this.books = books;
    }

    public Long getId() {

        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
