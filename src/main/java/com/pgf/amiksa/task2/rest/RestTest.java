package com.pgf.amiksa.task2.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTest {

    @GetMapping(path = "test")
    public String test(){
        return "hello";
    }

}
