package com.example.Service;

import com.example.Entity.User;
import com.example.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public String createUser(User user) {
        userRepo.save(user);
        return "User added successfully..";
    }

    public Optional<User> getUserById(Integer id) {
        return userRepo.findById(id);
    }
}
