package com.example.users.userportal.service.impl;

import com.example.users.userportal.converter.UserConverter;
import com.example.users.userportal.domain.dto.UserDto;
import com.example.users.userportal.repository.UserRepository;
import com.example.users.userportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author tvuchova
 *  implementational class of UserEntity Service
 */

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository repository) {
        this.userRepository = repository;
    }

    public void setRepository(UserRepository repository) {
        this.userRepository = repository;
    }
    @Override
    public UserDto getUserById(Long userId) {
        return UserConverter.entityToDto(userRepository.getOne(userId));
    }

    @Override
    public void saveUser(UserDto userDto) {
        userRepository.save(UserConverter.dtoToEntity(userDto));
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream().map(UserConverter::entityToDto).collect(Collectors.toList());
    }
    /*@Override
    public UserEntity create(UserEntity user) {
        return repository.save(user);
    }



    @Override
    public UserEntity delete(Long id) {
        UserEntity user=findById(id);
        if (user != null){
            repository.delete(user);
        }
        return user;
    }

    @Override
    public List<UserEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public UserEntity findById(Long id) {
        return repository.getOne(id);
    }

    @Override
    public UserEntity update(UserEntity user) {
        return repository.save(user);
    }*/
}
