package com.h3c.opm.opmmoduletask.service.impl;


import com.h3c.opm.opmmoduletask.service.ExampleService;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {

    @Override
    public String hello() {
      return "hello word!";
    }

}
