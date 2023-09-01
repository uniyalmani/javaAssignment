package com.springbootassignment.practice.gymmanagementassignment.service;

import com.springbootassignment.practice.gymmanagementassignment.model.Trainer;

import java.util.List;

public interface TrainerService {
    Trainer addTrainer(Trainer trainer);
    List<Trainer> getAllTrainers();
    Trainer getTrainerById(Long trainerId);
}
