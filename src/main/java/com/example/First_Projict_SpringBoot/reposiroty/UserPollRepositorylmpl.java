package com.example.First_Projict_SpringBoot.reposiroty;

import com.example.First_Projict_SpringBoot.model.UserPoll;
import com.example.First_Projict_SpringBoot.reposiroty.mapper.UserPollMapper;
import com.example.First_Projict_SpringBoot.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    public Integer getCountQ(Integer id) {
        Integer sql = Integer.valueOf("SELECT COUNT(*) AS id_count\n" +
                "        FROM users_poll\n" +
                "        WHERE poll_id = 'id'");
        return sql;
    }



    @Override
    public void printCountQO(Connection conn, String questionId) throws SQLException {
        String sql = "SELECT answer, COUNT(user_id) AS user_count FROM users_poll WHERE poll_id = ? GROUP BY answers";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, questionId);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String answer = resultSet.getString("answers");
                    int userCount = resultSet.getInt("user_count");
                    System.out.println("Answer: " + answer + ", Users Count: " + userCount);
                }
            }
        }
    }

    @Override
    public Integer getCountUserId(Integer id) {
        Integer sql = Integer.valueOf("SELECT COUNT(*) AS id_count\n" +
                "        FROM users_poll\n" +
                "        WHERE user_id = 'id'");
        return sql;
    }




    @Override
    public void printUserAnswer(Connection conn, Integer userId) throws SQLException {
        String sql = "SELECT poll_id, answer FROM user_poll WHERE user_id = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, String.valueOf(userId));
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String questionId = resultSet.getString("poll_id");
                    String answer = resultSet.getString("answers");
                    System.out.println("Question ID: " + questionId + ", Answer: " + answer);
                }
            }
        }
    }

    @Override
    public void printCountAll(Connection conn) throws SQLException {
            String sql = "SELECT question_id, answer, COUNT(user_id) AS user_count FROM your_table GROUP BY question_id, answer";
            try (PreparedStatement statement = conn.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {
                    String questionId = resultSet.getString("question_id");
                    String answer = resultSet.getString("answer");
                    int userCount = resultSet.getInt("user_count");

                    System.out.println("Question ID: " + questionId + ", Answer: " + answer + ", Users Count: " + userCount);
                }
            }

    }

}



