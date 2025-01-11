package com.apirest.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {


    @GetMapping("/home") //endpoint
    public String homePag() {
        return "This is the home page";
    }

    @GetMapping("/profile") // endpoint
    public String profilePag() {
        return "This is the profile page";
    }

}
