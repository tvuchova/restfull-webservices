package com.example.users.userportal.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserEntityControllerTest {
    @Autowired
    private MockMvc mockMvc;

    // @MockBean
    //  private BookService mockBookService;


    @Test
    public void addBookToStore() throws Exception {

        this.mockMvc.perform(get("/books"))
                .andExpect(status().isOk());
    }

    @Test
    public void searchBooks() {
    }
}
