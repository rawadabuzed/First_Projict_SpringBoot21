package com.example.First_Projict_SpringBoot.reposiroty;

import com.example.First_Projict_SpringBoot.model.UserPoll;

public interface UserPollRepository {

    void createUserPoll(UserPoll UserPoll);

    void updateUserPoll(UserPoll UserPoll);

    void deleteUserPoll(Integer id);

    UserPoll getUserPollById(Integer id);
}
