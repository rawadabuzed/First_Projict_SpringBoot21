package com.example.First_Projict_SpringBoot.reposiroty;

import com.example.First_Projict_SpringBoot.model.Poll;
import com.example.First_Projict_SpringBoot.reposiroty.mapper.PollMapper;
import com.example.First_Projict_SpringBoot.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PollRepositorylmpl implements PollRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createPoll(Poll poll) {
        String sql= "INSERT INTO"+ Constants.POLLS_TABLE_NAME +" (title,option1,option2,option3,option4) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql,
                poll.getTitle(),
                poll.getOption1(),
                poll.getOption2(),
                poll.getOption3(),
                poll.getOption4()
                );
    }

    @Override
    public void deletePollById(Integer id) {
        System.out.println("Poll with id = " + id + " was deleted");
        String sql = "DELETE FROM "+ Constants.POLLS_TABLE_NAME +" WHERE id = ?";
        jdbcTemplate.update(sql,id);
    }

    @Override
    public void updatePoll(Poll poll) {

    }

    @Override
    public void updatePollTitle(Integer id, String title) {
        String sql = "UPDATE "+ Constants.POLLS_TABLE_NAME +" SET title = ? WHERE id = ?";
        jdbcTemplate.update(sql,title,id);
    }

    @Override
    public void updatePollOption1(Integer id, String option1) {
        String sql = "UPDATE "+ Constants.POLLS_TABLE_NAME +" SET title = ? WHERE id = ?";
        jdbcTemplate.update(sql,option1,id);
    }

    @Override
    public void updatePollOption2(Integer id, String option2) {
        String sql = "UPDATE "+ Constants.POLLS_TABLE_NAME +" SET title = ? WHERE id = ?";
        jdbcTemplate.update(sql,option2,id);
    }

    @Override
    public void updatePollOption3(Integer id, String option3) {
        String sql = "UPDATE "+ Constants.POLLS_TABLE_NAME +" SET title = ? WHERE id = ?";
        jdbcTemplate.update(sql,option3,id);
    }

    @Override
    public void updatePollOption4(Integer id, String option4) {
        String sql = "UPDATE "+ Constants.POLLS_TABLE_NAME +" SET title = ? WHERE id = ?";
        jdbcTemplate.update(sql,option4,id);
    }

    @Override
    public Poll getPollById(Integer id) {
        String sql="SELECT * FROM " + Constants.POLLS_TABLE_NAME + "WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new PollMapper(),id);
    }


}
