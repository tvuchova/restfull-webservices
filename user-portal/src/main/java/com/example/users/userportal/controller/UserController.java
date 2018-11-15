package com.example.users.userportal.controller;


import com.example.users.userportal.domain.dto.UserDto;
import com.example.users.userportal.service.UserService;
import com.example.users.userportal.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(Constants.GET_USER_BY_ID)
    public UserDto getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }

    @RequestMapping(Constants.GET_ALL_USERS)
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value= Constants.SAVE_USER, method= RequestMethod.POST)
    public void saveUser(@RequestBody UserDto userDto) {
        userService.saveUser(userDto);
    }
    /*@GetMapping("/users")
    public List<UserEntity> getUsers() {
        return userService.findAll();
    }

    @GetMapping(path = {"/{id}"})
    public UserEntity findOne(@PathVariable("id") Long id){
        return userService.findById(id);
    }

    @DeleteMapping(path ={"/{id}"})
    public UserEntity delete(@PathVariable("id") Long id) {
        return userService.delete(id);
    }

    @PutMapping
    public UserEntity update(@PathVariable("id") Long id, @RequestBody UserEntity user){
        user.setId(id);
        return userService.update(user);
    }

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity user) {
        return userService.create(user);
    }*/

}