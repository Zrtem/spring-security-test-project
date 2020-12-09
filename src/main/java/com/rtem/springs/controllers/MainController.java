package com.rtem.springs.controllers;

import java.security.Principal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String homePage() {
        return "home page";
    }

    @GetMapping("/withAuth")
    public String authPage(Principal principal) {
        return "withAuth page: " + principal.getName();
    }



}
