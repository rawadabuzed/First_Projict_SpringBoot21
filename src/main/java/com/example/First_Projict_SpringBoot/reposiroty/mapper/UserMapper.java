package com.example.First_Projict_SpringBoot.reposiroty.mapper;


import com.example.First_Projict_SpringBoot.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;


public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User(
                rs.getInt("id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("email"),
                rs.getInt("age"),
                rs.getString("address"),
                rs.getDate("joining_date").toInstant().atZone(ZoneId.systemDefault()).toLocalDate()

        );
    }




}
