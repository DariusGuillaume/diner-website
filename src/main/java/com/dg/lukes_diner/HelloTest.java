package com.dg.lukes_diner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloTest{

    public static void main(String[] args) {
        SpringApplication.run(HelloTest.class, args);
}
}

@RestController
@RequestMapping("/hello")
class HelloController {

    @GetMapping
    public String hello() {
        return "Hello, World!";
    }
}



    

