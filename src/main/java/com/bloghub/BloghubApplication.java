package com.bloghub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class BloghubApplication {

    public static void main(String[] args) {
        SpringApplication.run(BloghubApplication.class, args);
    }

}
