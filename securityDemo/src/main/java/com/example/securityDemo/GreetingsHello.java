package com.example.securityDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsHello {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello shivaji";
		
    }

}
