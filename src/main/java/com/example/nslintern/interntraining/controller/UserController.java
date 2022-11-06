package com.example.nslintern.interntraining.controller;

import com.example.nslintern.interntraining.model.CurrUser;
import com.example.nslintern.interntraining.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public boolean saveUser(@RequestBody CurrUser user){
        boolean result = userService.saveUser(user);
        if(result) return ResponseEntity.ok("User created successfully").hasBody();
        else return ResponseEntity.status(HttpStatus.BAD_REQUEST).build().hasBody();
    }

    @GetMapping("/")
    public ResponseEntity<List<CurrUser>> fetchAllUser(){
        List<CurrUser> users;
        users = userService.fetchAllUser();
        return ResponseEntity.ok(users);
    }
}
