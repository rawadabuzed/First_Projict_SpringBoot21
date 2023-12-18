package com.example.First_Projict_SpringBoot.service;


import com.example.First_Projict_SpringBoot.model.User;
import com.example.First_Projict_SpringBoot.model.UserPoll;
import com.example.First_Projict_SpringBoot.model.UserPollRequest;
import com.example.First_Projict_SpringBoot.reposiroty.UserPollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPollServicelmpl implements UserPollService {

    @Autowired
    private UserPollRepository userPollRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private PollService pollService;


    @Override
    public void createUserPoll(UserPollRequest UserPollRequest) {
        UserPoll userPoll = null;
        int user = UserPollRequest.getUser().getId();
        int poll = UserPollRequest.getPoll().getId();
        String answer = UserPollRequest.getPoll().getAnswers();
        if (userService.getUserById(user) != null){
            userPoll.setUserId(user);
            userPoll.setPollId(poll);
            userPoll.setAnswers(answer);
            userPollRepository.createUserPoll(userPoll);
        }

    }

    @Override
    public void updateUserPoll(UserPoll UserPoll) {
        userPollRepository.updateUserPoll(UserPoll);
    }

    @Override
    public void deleteUserPoll(Integer id) {
        userPollRepository.deleteUserPoll(id);
    }

    @Override
    public UserPoll getUserPollById(Integer id) {
        return userPollRepository.getUserPollById(id);
    }

    @Override
    public void getNumUserA(Integer id) {

    }

    @Override
    public void getNumUserQ(Integer id) {

    }

    @Override
    public List<String> getUserAnswers(Integer id) {
        return null;
    }

    @Override
    public void getNumQuisUser(Integer id) {

    }

    @Override
    public void getAll() {

    }
}
