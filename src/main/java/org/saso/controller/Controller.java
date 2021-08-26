package org.saso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello Spring-Docker!";
    }

}
