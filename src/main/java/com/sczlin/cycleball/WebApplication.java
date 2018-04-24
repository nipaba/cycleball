package com.sczlin.cycleball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sczlin.cycleball.service.MockService;

@SpringBootApplication
public class WebApplication {


    
    public static void main(String[] args) throws Exception {
        MockService.init();
        SpringApplication.run(WebApplication.class, args);
//        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler http://localhost:8081/");
//        
//        if (Desktop.isDesktopSupported()) {
//            Desktop.getDesktop().browse(new URI("http://www.example.com"));
//        }
    }
}

