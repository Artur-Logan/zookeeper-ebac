package com.arturlogan.ebac_zookeeper_client.controllers;

import com.arturlogan.ebac_zookeeper_client.client.HelloWorldClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldClient helloWorlddClient;

    @GetMapping("/greetings")
    public String helloWorld(){
        return helloWorlddClient.HelloWorld();
    }
}
