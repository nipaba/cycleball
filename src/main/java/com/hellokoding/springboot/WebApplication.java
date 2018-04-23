package com.hellokoding.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {
    public static void main(String[] args) throws Exception {
        
        SpringApplication.run(WebApplication.class, args);
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler http://localhost:8080/");
    }
}

