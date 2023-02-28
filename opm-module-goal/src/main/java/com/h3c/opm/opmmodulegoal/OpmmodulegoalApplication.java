package com.h3c.opm.opmmodulegoal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class OpmmodulegoalApplication {

    public static void main(String[] args) {
    SpringApplication.run(OpmmodulegoalApplication.class, args);

    }

}
