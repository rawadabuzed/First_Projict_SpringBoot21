package com.example.First_Projict_SpringBoot.controller;


import com.example.First_Projict_SpringBoot.model.Poll;
import com.example.First_Projict_SpringBoot.model.User;
import com.example.First_Projict_SpringBoot.reposiroty.PollRepository;
import com.example.First_Projict_SpringBoot.service.PollService;
import com.example.First_Projict_SpringBoot.service.PollServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;

@RestController
@RequestMapping("/poll")
public class PollController {



    @Autowired
    private PollServicelmpl pollService;


    @PostMapping(value = "/create")
    public void createUser(@RequestBody Poll poll){

        pollService.createPoll(poll);


        //if (polls.containsKey(poll.getId())){
        //    return "poll already exists";
        //}else {
        //    polls.put(poll.getId(),poll);
        //    return "poll was created";
        //}
    }



    @DeleteMapping(value = "/delete_title")
    public void deletePollById(@RequestParam Integer id){

        pollService.deletePollById(id);

        //if (polls.containsKey(id)){
        //   polls.remove(id);
        //    return "poll was deleted";
        //}else{
        //    return "poll not found";
        //}
    }


    @PutMapping(value = "/update_title")
    public void updateTitle(@RequestParam Integer id, @RequestParam String title){

        pollService.updatePolltTitle(id, title);


        //if (polls.containsKey(id) && title != null && title.length() > 0){
        //    polls.get(id).setTitle(title);
        //    return "poll title was updated";
        //}else {
        //    return "poll not found or title was empty";
        //}
    }

    @PutMapping(value = "/update_option1")
    public void updateOption1(@RequestParam Integer id, @RequestParam String option1){

        pollService.updatePollOption1(id, option1);



        //if (polls.containsKey(id) && option1 != null && option1.length() > 0){
        //    polls.get(id).setTitle(option1);
        //    return "poll option1 was updated";
        //}else {
        //    return "poll not found or option1 was empty";
        //}
    }
    @PutMapping(value = "/update_option2")
    public void updateOption2(@RequestParam Integer id, @RequestParam String option2){

        pollService.updatePollOption2(id, option2);


        //if (polls.containsKey(id) && option2 != null && option2.length() > 0){
        //    polls.get(id).setTitle(option2);
        //    return "poll option2 was updated";
        //}else {
        //    return "poll not found or option2 was empty";
        //}
    }
    @PutMapping(value = "/update_option3")
    public void updateOption3(@RequestParam Integer id, @RequestParam String option3){


        pollService.updatePollOption3(id, option3);


        //if (polls.containsKey(id) && option3 != null && option3.length() > 0){
        //    polls.get(id).setTitle(option3);
        //    return "poll option3 was updated";
        //}else {
        //    return "poll not found or option3 was empty";
        //}
    }
    @PutMapping(value = "/update_option4")
    public void updateOption4(@RequestParam Integer id, @RequestParam String option4){


        pollService.updatePollOption4(id, option4);


        //if (polls.containsKey(id) && option4 != null && option4.length() > 0){
        //    polls.get(id).setTitle(option4);
        //    return "poll option4 was updated";
        //}else {
        //    return "poll not found or option4 was empty";
        //}
    }



    @GetMapping(value = "/by_id")
    public void  getPollById(@RequestParam Integer id){

    }




}
