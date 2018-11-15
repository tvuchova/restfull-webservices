package com.example.users.userportal.service;

import com.example.users.userportal.domain.dto.UserDto;

import java.util.List;

//@Service

/**
 * @author tvuchova
 * Create Service interface with methods required to retrieve the list of users,create,delete,update
 */
//@Service
public interface UserService {

   /* UserEntity create(UserEntity user);

    UserEntity delete(Long id);

    List<UserEntity> findAll();

    UserEntity findById(Long id);

    UserEntity update(UserEntity user);*/
   UserDto getUserById(Long userId);

    void saveUser(UserDto userDto);

    List<UserDto> getAllUsers();


}
