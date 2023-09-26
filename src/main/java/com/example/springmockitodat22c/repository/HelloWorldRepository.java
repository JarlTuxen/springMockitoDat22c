package com.example.springmockitodat22c.repository;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldRepository {
    public String getHelloWorld(){
        return "Hello World!";
    }
}
