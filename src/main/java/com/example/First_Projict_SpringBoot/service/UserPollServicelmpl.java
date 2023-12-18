package com.example.First_Projict_SpringBoot.service;

import com.example.First_Projict_SpringBoot.model.Poll;
import com.example.First_Projict_SpringBoot.model.User;
import com.example.First_Projict_SpringBoot.model.UserPoll;
import com.example.First_Projict_SpringBoot.model.UserPollRequest;
import com.example.First_Projict_SpringBoot.reposiroty.UserPollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        User user = UserPollRequest.getUser();
        UserPoll poll = UserPollRequest.getPoll();
        UserPoll userPoll = UserPollRequest.getPoll();
        if (userService.getUserById(user.getId()) != null){
            userPoll.setUserId(user.getId());
            userPoll.setPollId(poll.getPollId());
            userPollRepository.createUserPoll(userPoll);
        }else {
            userService.createUser(user);
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
}
