package com.example.First_Projict_SpringBoot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserPoll {

    private int id;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("poll_id")
    private Integer pollId;

    private String answers;

    public UserPoll(int id, Integer userId, Integer pollId, String answers) {
        this.id = id;
        this.userId = userId;
        this.pollId = pollId;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPollId() {
        return pollId;
    }

    public void setPollId(Integer pollId) {
        this.pollId = pollId;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }
}
