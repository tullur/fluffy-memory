package com.psidae.fluffymemory.controllers;

import com.psidae.fluffymemory.models.User;
import com.psidae.fluffymemory.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(User user) {
        userService.addUser(user);
    }
}
