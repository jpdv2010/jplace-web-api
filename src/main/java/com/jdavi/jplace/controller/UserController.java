package com.jdavi.jplace.controller;

import com.jdavi.jplace.data.model.User;
import com.jdavi.jplace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    private @ResponseBody List<User> getAll() {
        List<User> users = service.findAll();
        return users;
    }

    @PostMapping
    private @ResponseBody User save(@RequestBody User user) {
        System.out.println(user);
        return service.save( user );
    }

    @GetMapping("/{id}")
    private User getOne(@PathVariable Long id) {
        return service.findOne( id );
    }
}
