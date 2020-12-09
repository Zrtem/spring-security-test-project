package com.rtem.springs.controllers;

import com.rtem.springs.entities.User;
import com.rtem.springs.services.UserService;
import java.security.Principal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String homePage() {
        return "home page";
    }

    @GetMapping("/withAuth")
    public String authPage(Principal principal) {
        User user = userService.findByUsername(principal.getName());
        return "withAuth page: " + user.toString();
    }

    @GetMapping("/read_profile")
    public String profilePage() {
        return "profile page";
    }

    @GetMapping("/admins_only")
    public String adminPage() {
        return "admins page";
    }



}
