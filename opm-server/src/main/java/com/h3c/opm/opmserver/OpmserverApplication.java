package com.h3c.opm.opmserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class OpmserverApplication {

    public static void main(String[] args) {
    SpringApplication.run(OpmserverApplication.class, args);

    }

}
