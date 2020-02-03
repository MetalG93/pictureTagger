package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.TimeZone;

@SpringBootApplication
@ComponentScan("com.example.*")
public class DemoApplication {

    public static void main(String[] args) {
        try {
            TimeZone.setDefault(TimeZone.getTimeZone("Europe/Budapest"));
            SpringApplication.run(DemoApplication.class, args);
        }catch (Exception e){
            System.out.println(TimeZone.getDefault());
        }
    }
}
