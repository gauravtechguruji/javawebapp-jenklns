package com.example.sample_spring_app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample_spring_app.model.User;
import com.example.sample_spring_app.service.UserManagementService;

@RestController
public class UserMgtController {

    @Autowired
    UserManagementService userManagementService;

    @GetMapping("/users")
    public User[] getUserList() {
        return userManagementService.getUserList().toArray(new User[0]);
    }

    @PostMapping("/users/add")
    public void addUser(@RequestBody User user) {
        userManagementService.addUserList(user);
    }
    @GetMapping("/users/{Username}")
    public String getUserId(@PathVariable("Username") String username){
        return userManagementService.getUerId(username);
    }
}