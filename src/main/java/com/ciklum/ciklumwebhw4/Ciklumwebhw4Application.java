package com.ciklum.ciklumwebhw4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:config.xml")
@SpringBootApplication
public class Ciklumwebhw4Application extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(Ciklumwebhw4Application.class, args);
    }
}
