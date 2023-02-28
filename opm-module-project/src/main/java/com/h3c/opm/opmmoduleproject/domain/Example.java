package com.h3c.opm.opmmoduleproject.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Example {

    private Long id;

    private String code;

    private String name;

}
