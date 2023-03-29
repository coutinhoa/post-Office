package com.example.postOffice.controllers;

import com.example.postOffice.models.User;
import com.example.postOffice.services.UsersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8888", methods={RequestMethod.GET})
@RestController
class UsersController {

    private final UsersService service;
    UsersController(UsersService service) {
        this.service = service;
    }

    @GetMapping("/users")
    List<User> all() {
        List<User> users= service.getAllUsers();
        return users;
    }

    @GetMapping("/users/{id}")
    Optional<User> getUser(@PathVariable Long id) {
        return service.getUser(id);
    }

}
