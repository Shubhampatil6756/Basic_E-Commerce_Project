package com.example.Controller;

import com.example.Entity.User;
import com.example.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("user")
    public String createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("user/id/{id}")
    public Optional<User> getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

}
