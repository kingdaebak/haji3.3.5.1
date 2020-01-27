package com.test.haji.demo.controller;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class CustomerForm {
    @NotNull
    @Size(min = 1, max = 127)
    private String first_name;

    @NotNull
    @Size(min =1, max = 127)
    private String last_name;
}
