package com.h3c.opm.opmmoduleinfra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class OpmmoduleinfraApplication {

    public static void main(String[] args) {
    SpringApplication.run(OpmmoduleinfraApplication.class, args);

    }

}
