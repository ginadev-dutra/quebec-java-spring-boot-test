package com.spring.boot.test.spring_boot_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String saudacao(@RequestParam(name="nome", defaultValue = "DIO") String nome){
        return String.format("Bem-vindo, %s", nome);
    }


}
