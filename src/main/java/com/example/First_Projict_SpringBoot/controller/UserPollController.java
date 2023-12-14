package com.example.First_Projict_SpringBoot.controller;

import com.example.First_Projict_SpringBoot.model.UserPoll;
import com.example.First_Projict_SpringBoot.model.UserPollRequest;
import com.example.First_Projict_SpringBoot.service.UserPollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user_poll")
public class UserPollController {


    @Autowired
    private UserPollService userPollService;

    @PostMapping
    public void UserPoll(@RequestBody UserPollRequest userPollRequest){
        userPollService.createUserPoll(userPollRequest);
    }
    @PutMapping
    public void updateUserPoll(@RequestBody UserPoll userPoll){
        userPollService.updateUserPoll(userPoll);
    }
    @DeleteMapping(value = "/delete")
    public void deleteUserPoll(@RequestParam Integer id){
        userPollService.deleteUserPoll(id);
    }

    @GetMapping(value = "/by_id")
    public UserPoll getUserPollById(@RequestParam Integer id){
        return userPollService.getUserPollById(id);
    }

























































}
