package com.example.users.userportal.domain.dto;

import com.example.users.userportal.domain.dto.BookDto;

import java.util.ArrayList;
import java.util.List;

public class UserDto {
    Long userId;
    String firstName;
    String lastName;
    String email;
    List<BookDto> bookDtos= new ArrayList<>();

    public UserDto(Long userId, String firstName, String lastName, String email, List<BookDto> bookDtos) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.bookDtos = bookDtos;
    }

    public UserDto(Long userId, String firstName, List<BookDto> bookDtos) {
        this.userId = userId;
        this.firstName = firstName;
        this.bookDtos = bookDtos;
    }

    public UserDto() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public List<BookDto> getBookDtos() {
        return bookDtos;
    }

    public void setBookDtos(List<BookDto> bookDtos) {
        this.bookDtos = bookDtos;
    }
}
