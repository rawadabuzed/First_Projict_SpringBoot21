package com.example.First_Projict_SpringBoot.reposiroty;

import com.example.First_Projict_SpringBoot.model.UserPoll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserPollRepositorylmpl implements UserPollRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void createUserPoll(UserPoll UserPoll) {

    }

    @Override
    public void updateUserPoll(UserPoll UserPoll) {

    }

    @Override
    public void deleteUserPoll(Integer id) {

    }

    @Override
    public UserPoll getUserPollById(Integer id) {
        return null;
    }
}
