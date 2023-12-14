package com.example.First_Projict_SpringBoot.controller;


import com.example.First_Projict_SpringBoot.model.Poll;
import com.example.First_Projict_SpringBoot.model.User;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;

@RestController
@RequestMapping("/PollController")
public class PollController {

    HashMap<Integer, Poll> polls = new HashMap<>();


    @PostMapping
    public String createUser(@RequestBody Poll poll){
        if (polls.containsKey(poll.getId())){
            return "poll already exists";
        }else {
            polls.put(poll.getId(),poll);
            return "poll was created";
        }
    }



    @DeleteMapping(value = "/delete_title")
    public String deletePollById(@RequestParam int id){
        if (polls.containsKey(id)){
            polls.remove(id);
            return "poll was deleted";
        }else{
            return "poll not found";
        }
    }


    @PutMapping(value = "/update_title")
    public String updateTitle(@RequestParam String title, @RequestParam int id){
        if (polls.containsKey(id) && title != null && title.length() > 0){
            polls.get(id).setTitle(title);
            return "poll title was updated";
        }else {
            return "poll not found or title was empty";
        }
    }

    @PutMapping(value = "/update_option1")
    public String updateOption1(@RequestParam String option1, @RequestParam int id){
        if (polls.containsKey(id) && option1 != null && option1.length() > 0){
            polls.get(id).setTitle(option1);
            return "poll option1 was updated";
        }else {
            return "poll not found or option1 was empty";
        }
    }
    @PutMapping(value = "/update_option2")
    public String updateOption2(@RequestParam String option2, @RequestParam int id){
        if (polls.containsKey(id) && option2 != null && option2.length() > 0){
            polls.get(id).setTitle(option2);
            return "poll option2 was updated";
        }else {
            return "poll not found or option2 was empty";
        }
    }
    @PutMapping(value = "/update_option3")
    public String updateOption3(@RequestParam String option3, @RequestParam int id){
        if (polls.containsKey(id) && option3 != null && option3.length() > 0){
            polls.get(id).setTitle(option3);
            return "poll option3 was updated";
        }else {
            return "poll not found or option3 was empty";
        }
    }
    @PutMapping(value = "/update_option4")
    public String updateOption4(@RequestParam String option4, @RequestParam int id){
        if (polls.containsKey(id) && option4 != null && option4.length() > 0){
            polls.get(id).setTitle(option4);
            return "poll option4 was updated";
        }else {
            return "poll not found or option4 was empty";
        }
    }



    @GetMapping(value = "/by_id")
    public Poll getPollById(@RequestParam int id){
        return polls.get(id);
    }




}
