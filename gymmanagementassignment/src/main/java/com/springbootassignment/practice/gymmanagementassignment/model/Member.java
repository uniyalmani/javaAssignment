package com.springbootassignment.practice.gymmanagementassignment.model;

import java.util.List;

public class Member {
    private Long memberId;
    private List<Trainer> trainers;
    private Gym gym;

    public  Long getMemberId(){
        return memberId;
    }

}
