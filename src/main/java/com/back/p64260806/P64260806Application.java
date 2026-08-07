package com.back.p64260806;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class P64260806Application {

    public static void main(String[] args) {
        SpringApplication.run(P64260806Application.class, args);
    }

}
