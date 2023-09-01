package com.springbootassignment.practice.gymmanagementassignment.controller;

import com.springbootassignment.practice.gymmanagementassignment.model.Gym;
import com.springbootassignment.practice.gymmanagementassignment.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/gym")
public class GymController {

    private final GymService gymService;

    @Autowired
    public GymController(GymService gymService) {
        this.gymService = gymService;
    }

    @PostMapping("")
    public Gym addGym(@RequestBody Gym gym) {
        return gymService.addGym(gym);
    }

    @GetMapping
    public List<Gym> getAllGyms() {
        return gymService.getAllGyms();
    }

    @GetMapping("/{gymId}")
    public ResponseEntity<Gym> getGymById(@PathVariable Long gymId) {
        Gym gym = gymService.getGymById(gymId);
        if (gym != null) {
            return ResponseEntity.ok(gym);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
