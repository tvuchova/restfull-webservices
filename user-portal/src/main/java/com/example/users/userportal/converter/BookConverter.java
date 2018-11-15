package com.example.users.userportal.converter;

import com.example.users.userportal.domain.dto.BookDto;
import com.example.users.userportal.domain.BookEntity;



public class BookConverter {
    public static BookEntity dtoToEntity(BookDto bookDto) {

        BookEntity bookEntity = new BookEntity(bookDto.getName(),
                                              null);
        bookEntity.setId(bookDto.getBookId());

        return bookEntity ;

    }

    public static BookDto entityToDto(BookEntity book) {

        return new BookDto(book.getId(), book.getName());

    }
}
