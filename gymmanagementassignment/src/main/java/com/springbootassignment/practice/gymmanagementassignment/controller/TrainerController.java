package com.springbootassignment.practice.gymmanagementassignment.controller;

import com.springbootassignment.practice.gymmanagementassignment.model.Trainer;
import com.springbootassignment.practice.gymmanagementassignment.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trainer")
public class TrainerController {

    private final TrainerService trainerService;

    @Autowired
    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @PostMapping("")
    public Trainer addTrainer(@RequestBody Trainer trainer) {
        return trainerService.addTrainer(trainer);
    }

    @GetMapping("")
    public List<Trainer> getAllTrainers() {
        return trainerService.getAllTrainers();
    }

    @GetMapping("/{trainerId}")
    public ResponseEntity<Trainer> getTrainerById(@PathVariable Long trainerId) {
        Trainer trainer = trainerService.getTrainerById(trainerId);
        if (trainer != null) {
            return ResponseEntity.ok(trainer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}