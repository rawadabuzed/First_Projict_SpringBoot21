package com.example.First_Projict_SpringBoot.reposiroty;

import com.example.First_Projict_SpringBoot.model.UserPoll;

import java.sql.Connection;
import java.sql.SQLException;
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

    Integer getCountQ(Integer id);

    void printCountQO(Connection conn, String questionId) throws SQLException;

    Integer getCountUserId(Integer id);

    void printUserAnswer(Connection conn, Integer userId) throws SQLException;

    void printCountAll(Connection conn) throws SQLException;
}