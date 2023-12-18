package com.example.First_Projict_SpringBoot.reposiroty;

import com.example.First_Projict_SpringBoot.model.UserPoll;
import com.example.First_Projict_SpringBoot.reposiroty.mapper.UserPollMapper;
import com.example.First_Projict_SpringBoot.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserPollRepositorylmpl implements UserPollRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void createUserPoll(UserPoll UserPoll) {
        String sql = "INSERT INTO " + Constants.USERS_POLL_TABLE_NAME + " (user_id,poll_id,answers) VALUES (?,?,?)";
        jdbcTemplate.update(sql, UserPoll.getUserId(),UserPoll.getPollId(),UserPoll.getAnswers());
    }

    @Override
    public void updateUserPoll(UserPoll UserPoll) {
        String sql = "UPDATE " + Constants.USERS_POLL_TABLE_NAME + " SET user_id = ?, poll_id = ?, answers = ?  WHERE id = ?";
        jdbcTemplate.update(sql,UserPoll.getUserId(),UserPoll.getPollId(),UserPoll.getAnswers(),UserPoll.getId());
    }

    @Override
    public void deleteUserPoll(Integer id) {
        String sql = "DELETE FROM " + Constants.USERS_POLL_TABLE_NAME + " WHERE id = ?";
        jdbcTemplate.update(sql,id);
    }

    @Override
    public UserPoll getUserPollById(Integer id) {
        String sql = "SELECT * FROM " + Constants.USERS_POLL_TABLE_NAME + " WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new UserPollMapper(),id);
    }

    @Override
    public void getNumUserA(Integer id) {
        String sql = "SELECT * FROM " + Constants.USERS_POLL_TABLE_NAME + " WHERE poll_id = ?";

    }

    @Override
    public void getNumUserQ(Integer id) {
        String sql = "SELECT * FROM " + Constants.USERS_POLL_TABLE_NAME + " WHERE poll_id = ?";

    }

    @Override
    public List<String> getUserAnswers(Integer id) {
        String sql = "SELECT * FROM " + Constants.USERS_POLL_TABLE_NAME + " WHERE user_id = ?";
        return null;
    }

    @Override
    public void getNumQuisUser(Integer id) {
        String sql = "SELECT * FROM " + Constants.USERS_POLL_TABLE_NAME + " WHERE user_id = ?";

    }

    @Override
    public void getAll() {

    }
}
