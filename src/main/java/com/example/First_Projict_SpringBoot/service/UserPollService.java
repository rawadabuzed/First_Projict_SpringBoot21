package com.example.First_Projict_SpringBoot.service;

import com.example.First_Projict_SpringBoot.model.UserPoll;
import com.example.First_Projict_SpringBoot.model.UserPollRequest;

import java.util.List;


public interface UserPollService {

    void createUserPoll(UserPollRequest UserPollRequest);
    void updateUserPoll(UserPoll UserPoll);
    void deleteUserPoll(Integer id);

    UserPoll getUserPollById(Integer id);

    void getNumUserA(Integer id);
    void getNumUserQ(Integer id);
    List<String> getUserAnswers(Integer id);
    void getNumQuisUser(Integer id);
    void getAll();



}
