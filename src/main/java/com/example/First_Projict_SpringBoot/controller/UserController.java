package com.example.First_Projict_SpringBoot.controller;

import com.example.First_Projict_SpringBoot.model.User;
import com.example.First_Projict_SpringBoot.service.UserServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    //HashMap<Integer, User> users = new HashMap<>();

    @Autowired
    private UserServicelmpl userService;

    @PostMapping(value = "/create")
    public void createUser(@RequestBody User user){

        userService.createUser(user);


        //if (users.containsKey(user.getId())){
        //    return "user already exists";
        //}else {
        //    users.put(user.getId(),user);
        //    user.setJoiningDate(LocalDate.now());
        //    return "user was created";
        //}
    }

    @DeleteMapping(value = "/delete")
    public void deleteUserById(@RequestParam Integer id){

        userService.deleteUserById(id);


        //if (users.containsKey(id)){
        //    users.remove(id);
        //    return "user was deleted";
        //}else{
        //    return "user not found";
        //}
    }

    @PutMapping(value = "/update_first_name")
    public void updateUserFirstName(@RequestParam Integer id,@RequestParam(value = "first_name") String firstName){

        userService.updateUserFirstName(id, firstName);

        //if (users.containsKey(id) && name != null && name.length() > 0){
        //    users.get(id).setFirstName(name);
        //    return "user's name was updated";
        //}else {
        //    return "user's not found or name was empty";
        //}
    }

    @PutMapping(value = "/update_last_name")
    public void updateUserLastName(@RequestParam Integer id,@RequestParam(value = "last_name") String lastName){

        userService.updateUserLastName(id, lastName);


        //if (users.containsKey(id) && lastName != null && lastName.length() > 0){
        //    users.get(id).setLastName(lastName);
        //    return "user's lastName was updated";
        //}else {
        //    return "user's not found or lastName was empty";
        //}
    }


    @PutMapping(value = "/update_email")
    public void updateUserEmail(@RequestParam Integer id,@RequestParam String email){

        userService.updateUserEmail(id, email);

        //if (users.containsKey(id) && email != null && email.length() > 0){
        //    users.get(id).setEmail(email);
        //    return "user's email was updated";
        //}else {
        //    return "user's not found or email was empty";
        //}
    }




    @PutMapping(value = "/update_age")
    public void updateUserAge(@RequestParam Integer id, @RequestParam Integer age){

        userService.updateUserAge(id, age);


        //if (users.containsKey(id) && age != null && age.length() > 0){
        //    users.get(id).setEmail(age);
        //   return "user's age was updated";
        //}else {
        //    return "user's not found or age was empty";
        //}
    }


    @PutMapping(value = "/update_address")
    public void updateUserAddress(@RequestParam Integer id,@RequestParam String address){

        userService.updateUserAddress(id, address);


        //if (users.containsKey(id) && address != null && address.length() > 0){
        //    users.get(id).setEmail(address);
        //    return "user's address was updated";
        //}else {
        //    return "user's not found or address was empty";
        //}
    }

    @GetMapping(value = "/by_id")
    public User getUserById(@RequestParam Integer id){

        return userService.getUserById(id);

    }

}
