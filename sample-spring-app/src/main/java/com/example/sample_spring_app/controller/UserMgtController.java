package com.example.sample_spring_app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample_spring_app.model.User;

@RestController
public class UserMgtController {

    @RequestMapping("/users")
    public User[] getUserList() {

        List<User> userList = new ArrayList();
        userList.add(new User("Joy", "1234-scdw2-2fcevw342-2323"));
        userList.add(new User("Chandler", "3454-2csfdfd-sfdvsdjv-7623"));
        return userList.toArray(new User[0]);
    }
}
