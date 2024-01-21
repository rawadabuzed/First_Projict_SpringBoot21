package com.example.First_Projict_SpringBoot.controller;

import com.example.First_Projict_SpringBoot.UserEnum;
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

    public void userEnum(){
        UserEnum Value = UserEnum.id;
        System.out.println("Selected value; " + Value);

        switch (Value) {
            case id :
                    System.out.println("this UserPoll id:");
            break;
            case userId :
                    System.out.println("this UserPoll userId:");
            break;
            case pollId :
                    System.out.println("this UserPoll pollId:");
            break;
            case answers :
                    System.out.println("this UserPoll answers:");
            default:
                System.out.println("Unknown value");
        }


    }

    @PostMapping
    public void createUserPoll(@RequestBody UserPollRequest userPollRequest){
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
