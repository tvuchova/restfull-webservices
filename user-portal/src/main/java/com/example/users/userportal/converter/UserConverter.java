package com.example.users.userportal.converter;

import com.example.users.userportal.domain.UserEntity;
import com.example.users.userportal.domain.dto.UserDto;

import java.util.stream.Collectors;

public class UserConverter {
    public static UserEntity dtoToEntity(UserDto userDto) {
        /*UserEntity userEntity = new UserEntity(userDto.getUserId(),userDto.getFirstName(),
                             userDto.getLastName(),userDto.getEmail(),null);*/
        UserEntity userEntity = new UserEntity(userDto.getFirstName(), null);
        userEntity.setId(userDto.getUserId());
        userEntity.setBooks(userDto.getBookDtos().stream().map(BookConverter::dtoToEntity).collect(Collectors.toList()));
        return userEntity;
    }

    public static UserDto entityToDto(UserEntity userEntity) {
        UserDto userDto = new UserDto(userEntity.getId(), userEntity.getLastName(), null);
        userDto.setBookDtos(userEntity.getBooks().stream().map(BookConverter::entityToDto).collect(Collectors.toList()));
        return userDto;
    }
}
