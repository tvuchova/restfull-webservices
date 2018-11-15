package com.example.users.userportal.service;

import com.example.users.userportal.repository.UserRepository;
import com.example.users.userportal.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserEntityServiceTest {
    @Mock
    private UserRepository mockUserRepository;

    private UserService userService;

    @Before
    public void setUp() {
        this.userService = new UserServiceImpl(mockUserRepository);
    }

    @Test
    public void addBook() {

        //
       //userService.addUser(new BookDto());
    }

    @Test
    public void searchBooks() {
    }
}
