package com.springbootassignment.practice.gymmanagementassignment.service;

import java.util.ArrayList;
import com.springbootassignment.practice.gymmanagementassignment.model.Trainer;

import java.util.List;

public class TrainerServiceImpl implements TrainerService {
    private List<Trainer> trainers = new ArrayList<>();


    public Trainer addTrainer(Trainer trainer) {
        trainers.add(trainer);
        return trainer;
    }


    public List<Trainer> getAllTrainers() {
        return trainers;
    }


    public Trainer getTrainerById(Long trainerId) {
        return trainers.stream()
                .filter(trainer -> trainer.getTrainerId().equals(trainerId))
                .findFirst()
                .orElse(null);
    }


}
