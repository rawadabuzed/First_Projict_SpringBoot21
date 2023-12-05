package com.example.First_Projict_SpringBoot.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/polls")
public class PollController {

    private final Map<String, Poll> polls = new HashMap<>();
    private final Map<String, String> answers = new HashMap<>();

    @PostMapping("/create")
    public ResponseEntity<Poll> createPoll(@RequestBody Poll poll){
        polls.put(poll.getId(), poll);
        return new ResponseEntity<>(poll, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Poll> getPoll(@PathVariable String id) {
        return new ResponseEntity<>(polls.get(id), HttpStatus.OK);
    }

    @PostMapping("/{id}/answer")
    public ResponseEntity<String> answerPoll(@PathVariable String id,@RequestBody PollAnswer answer){
        answers.put(answer.getUserId() + id, answer.getSelectedOption());
        return new ResponseEntity<>("Answer saved", HttpStatus.OK);
    }



}
