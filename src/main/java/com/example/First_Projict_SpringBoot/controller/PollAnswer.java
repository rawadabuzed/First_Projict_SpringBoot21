package com.example.First_Projict_SpringBoot.controller;

public class PollAnswer {

    private String userId;
    private String pollId;
    private String selectedOption;

    public PollAnswer(String userId, String pollId, String selectedOption) {
        this.userId = userId;
        this.pollId = pollId;
        this.selectedOption = selectedOption;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPollId() {
        return pollId;
    }

    public void setPollId(String pollId) {
        this.pollId = pollId;
    }

    public String getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }
}
