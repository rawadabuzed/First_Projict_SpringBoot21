package com.example.First_Projict_SpringBoot.reposiroty.mapper;

import com.example.First_Projict_SpringBoot.model.Poll;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PollMapper implements RowMapper<Poll> {


    @Override
    public Poll mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Poll(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getString("option1"),
                rs.getString("option2"),
                rs.getString("option3"),
                rs.getString("option4")

        );
    }




}
