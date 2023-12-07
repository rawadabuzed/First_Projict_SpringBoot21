package com.example.First_Projict_SpringBoot.controller;

import com.example.First_Projict_SpringBoot.model.User;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;

@RestController
@RequestMapping("/UserController")
public class UserController {
    HashMap<Integer, User> users = new HashMap<>();

    @PostMapping
    public String createUser(@RequestBody User user){
        if (users.containsKey(user.getId())){
            return "user already exists";
        }else {
            users.put(user.getId(),user);
            user.setJoiningDate(LocalDate.now());
            return "user was created";
        }
    }

    @DeleteMapping
    public String deleteUserById(@RequestParam int id){
        if (users.containsKey(id)){
            users.remove(id);
            return "user was deleted";
        }else{
            return "user not found";
        }
    }

    @PutMapping(value = "/update_name")
    public String updateUserName(@RequestParam String name, @RequestParam int id){
        if (users.containsKey(id) && name != null && name.length() > 0){
            users.get(id).setFirstName(name);
            return "user's name was updated";
        }else {
            return "user's not found or name was empty";
        }
    }

    @PutMapping(value = "/update_lastName")
    public String updateUserLastName(@RequestParam String lastName,@RequestParam int id){
        if (users.containsKey(id) && lastName != null && lastName.length() > 0){
            users.get(id).setLastName(lastName);
            return "user's lastName was updated";
        }else {
            return "user's not found or lastName was empty";
        }
    }


    @PutMapping(value = "/update_email")
    public String updateUserEmail(@RequestParam String email, @RequestParam int id){
        if (users.containsKey(id) && email != null && email.length() > 0){
            users.get(id).setEmail(email);
            return "user's email was updated";
        }else {
            return "user's not found or email was empty";
        }
    }




    @PutMapping(value = "/update_age")
    public String updateUserAge(@RequestParam String age, @RequestParam int id){
        if (users.containsKey(id) && age != null && age.length() > 0){
            users.get(id).setEmail(age);
            return "user's age was updated";
        }else {
            return "user's not found or age was empty";
        }
    }


    @PutMapping(value = "/update_address")
    public String updateUserAddress(@RequestParam String address, @RequestParam int id){
        if (users.containsKey(id) && address != null && address.length() > 0){
            users.get(id).setEmail(address);
            return "user's address was updated";
        }else {
            return "user's not found or address was empty";
        }
    }

    @GetMapping(value = "/all")
    public HashMap<Integer,User> getAllUsers(){
        return users;
    }

    @GetMapping(value = "/by_id")
    public User getUserById(@RequestParam int id){
        return users.get(id);
    }

}
