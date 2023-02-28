package com.h3c.opm.opmmoduleinfra.controller;


import com.h3c.opm.opmmoduleinfra.service.ExampleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Api(tags = "示例控制器")
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/example")
public class ExampleController {

    private final ExampleService exampleService;

    @ApiOperation(value = "示例接口")
    @GetMapping("/hello")
    public String hello() {
        return exampleService.hello();
    }
}