package com.example.First_Projict_SpringBoot.service;

import com.example.First_Projict_SpringBoot.model.UserPoll;
import com.example.First_Projict_SpringBoot.model.UserPollRequest;


public interface UserPollService {

    void createUserPoll(UserPollRequest UserPollRequest);
    void updateUserPoll(UserPoll UserPoll);
    void deleteUserPoll(Integer id);

    UserPoll getUserPollById(Integer id);



}
