package com.teclas.disney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.teclas.disney.model.entity")
public class DisneyApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisneyApiApplication.class, args);
    }

}
