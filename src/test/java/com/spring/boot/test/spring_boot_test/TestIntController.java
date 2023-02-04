package com.spring.boot.test.spring_boot_test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@WebMvcTest
@ExtendWith(SpringExtension.class)
public class TestIntController {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testInt() throws Exception{
        RequestBuilder requisição = get("/test");
        MvcResult resultado = mvc.perform(requisição).andReturn();
        assertEquals("Bem-vindo, DIO",resultado.getResponse().getContentAsString());
    }

    @Test
    public void testIntComArgumento() throws Exception{
        mvc.perform(get("/test?nome=Gina"))
                .andExpect(content().string("Bem-vindo, Gina"));
    }
}
