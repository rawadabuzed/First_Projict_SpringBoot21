package com.example.First_Projict_SpringBoot.reposiroty;

import com.example.First_Projict_SpringBoot.model.User;
import com.example.First_Projict_SpringBoot.model.UserPoll;
import com.example.First_Projict_SpringBoot.reposiroty.mapper.UserMapper;
import com.example.First_Projict_SpringBoot.reposiroty.mapper.UserPollMapper;
import com.example.First_Projict_SpringBoot.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public abstract class UserRepositorylmpl implements UserRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;


  //rs.getInt("id"),
  //        rs.getString("first_name"),
  //        rs.getString("last_name"),
  //        rs.getString("email"),
  //        rs.getInt("age"),
   //       rs.getString("address"),
    //      rs.getDate("joining_date").toLocalDate()

    @Override
    public void createUser(User user) {
        String sql = "INSERT INTO "+ Constants.USERS_TABLE_NAME +" (first_name,last_name,email,age,address,joining_date) VALUES (?,?,?,?,?,?)";
        jdbcTemplate.update(sql,
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getAge(),
                user.getAddress(),
                user.getJoiningDate()
        );

    }

    @Override
    public void deleteUserById(Integer id) {
        System.out.println("User with id = " + id + " was deleted");
        String sql = "DELETE FROM "+ Constants.USERS_TABLE_NAME +" WHERE id = ?";
        jdbcTemplate.update(sql,id);
    }

    //u need to update this code :)
    @Override
    public void updateUser(User user) {
        System.out.println("User " + user + " was updated");
        String sql;
        if(user.getFirstName() != null && user.getLastName() == null && user.getEmail() == null){
            sql = "UPDATE "+ Constants.USERS_TABLE_NAME +" SET first_name = ? WHERE id = ?";
            jdbcTemplate.update(sql,user.getFirstName(),user.getId());


        }else if (user.getFirstName() == null && user.getLastName() != null && user.getEmail() == null){
            sql = "UPDATE "+ Constants.USERS_TABLE_NAME +" SET last_name = ? WHERE id = ?";
            jdbcTemplate.update(sql,user.getLastName(),user.getId());


        }else if(user.getFirstName() == null && user.getLastName() == null && user.getEmail() != null){
            sql = "UPDATE "+ Constants.USERS_TABLE_NAME +" SET email = ? WHERE id = ?";
            jdbcTemplate.update(sql,user.getEmail(),user.getId());



        }else if(user.getFirstName() != null && user.getLastName() != null && user.getEmail() == null){
            sql = "UPDATE "+ Constants.USERS_TABLE_NAME +" SET first_name = ?,last_name = ? WHERE id = ?";
            jdbcTemplate.update(sql,user.getFirstName(),user.getLastName(),user.getId());


        }else if(user.getFirstName() != null && user.getLastName() == null && user.getEmail() != null){
            sql = "UPDATE "+ Constants.USERS_TABLE_NAME +" SET first_name = ?,email = ? WHERE id = ?";
            jdbcTemplate.update(sql,user.getFirstName(),user.getEmail(),user.getId());


        }else if(user.getFirstName() == null && user.getLastName() != null && user.getEmail() != null){
            sql = "UPDATE "+ Constants.USERS_TABLE_NAME +" SET last_name = ?, email = ? WHERE id = ?";
            jdbcTemplate.update(sql,user.getLastName(),user.getEmail(),user.getId());


        }else{
            sql = "UPDATE "+ Constants.USERS_TABLE_NAME +" SET first_name = ?, last_name = ?, email = ? WHERE id = ?";
            jdbcTemplate.update(sql,user.getFirstName(),user.getLastName(),user.getEmail(),user.getId());
        }
    }

    @Override
    public void updateUserFirstName(Integer id, String firstName) {
        String sql = "UPDATE "+ Constants.USERS_TABLE_NAME +" SET first_name = ? WHERE id = ?";
        jdbcTemplate.update(sql,firstName,id);
    }

    @Override
    public void updateUserLastName(Integer id, String lastName) {
        String sql = "UPDATE "+ Constants.USERS_TABLE_NAME +" SET last_name = ? WHERE id = ?";
        jdbcTemplate.update(sql,lastName,id);
    }

    @Override
    public void updateUserEmail(Integer id, String email) {
        String sql = "UPDATE "+ Constants.USERS_TABLE_NAME +" SET email = ? WHERE id = ?";
        jdbcTemplate.update(sql,email,id);
    }

    @Override
    public void updateUserAge(Integer id, Integer age) {
        String sql = "UPDATE "+ Constants.USERS_TABLE_NAME +" SET age = ? WHERE id = ?";
        jdbcTemplate.update(sql,age.toString(),id);
    }

    @Override
    public void updateUserAddress(Integer id, String address) {
        String sql = "UPDATE "+ Constants.USERS_TABLE_NAME +" SET address = ? WHERE id = ?";
        jdbcTemplate.update(sql,address,id);
    }



    @Override
    public User getUserById(Integer id) {
        String sql = "SELECT * FROM " + Constants.USERS_TABLE_NAME + " WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new UserMapper(),id);
    }


}
