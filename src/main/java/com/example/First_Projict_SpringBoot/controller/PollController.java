package com.example.First_Projict_SpringBoot.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PollController")
public class PollController {

    @PostMapping
    public String createUser(@RequestBody User user){
        if (users.containsKey(user.getId())){
            return "user already exists";
        }else {
            users.put(user.getId(),user);
            return "user was created";
        }

    }



















































}
