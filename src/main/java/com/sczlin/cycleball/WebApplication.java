package com.sczlin.cycleball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {
    public static void main(String[] args) throws Exception {
        
        SpringApplication.run(WebApplication.class, args);
//        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler http://localhost:8081/");
//        
//        if (Desktop.isDesktopSupported()) {
//            Desktop.getDesktop().browse(new URI("http://www.example.com"));
//        }
    }
}

