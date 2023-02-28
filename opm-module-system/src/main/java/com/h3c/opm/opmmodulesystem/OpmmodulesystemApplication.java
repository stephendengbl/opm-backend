package com.h3c.opm.opmmodulesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class OpmmodulesystemApplication {

    public static void main(String[] args) {
    SpringApplication.run(OpmmodulesystemApplication.class, args);

    }

}
