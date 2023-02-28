package com.h3c.opm.opmmoduletask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class OpmmoduletaskApplication {

    public static void main(String[] args) {
    SpringApplication.run(OpmmoduletaskApplication.class, args);

    }

}
