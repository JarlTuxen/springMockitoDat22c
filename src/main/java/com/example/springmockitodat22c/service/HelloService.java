package com.example.springmockitodat22c.service;

import com.example.springmockitodat22c.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    HelloWorldRepository helloWorldRepository;

    public String helloMessage(){
        return helloWorldRepository.getHelloWorld();
    }
}
