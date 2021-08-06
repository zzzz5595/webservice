package com.example.webservice.dto;

import com.example.webservice.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = HelloController.class)
class HelloResponseDtoTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void dtoTest() throws Exception {
        String name = "test";
        int amount = 1000;

        mvc.perform(MockMvcRequestBuilders.get("/hello")
                            .param("name" , name)
                            .param("amount" , String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name" , is(name)))
                .andExpect(jsonPath("$.amount" , is(amount)))
                .andDo(print());



    }

}