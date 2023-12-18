package com.example.First_Projict_SpringBoot.reposiroty;

import com.example.First_Projict_SpringBoot.model.UserPoll;

import java.util.List;

public interface UserPollRepository {

    void createUserPoll(UserPoll UserPoll);

    void updateUserPoll(UserPoll UserPoll);

    void deleteUserPoll(Integer id);

    UserPoll getUserPollById(Integer id);

    void getNumUserA(Integer id);
    void getNumUserQ(Integer id);
    List<String> getUserAnswers(Integer id);
    void getNumQuisUser(Integer id);
    void getAll();
}
