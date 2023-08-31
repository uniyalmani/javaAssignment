package com.springbootpractice.courierdelivery.courierdelivery.controller;


import com.springbootpractice.courierdelivery.courierdelivery.enums.CourierType;
import com.springbootpractice.courierdelivery.courierdelivery.enums.Status;
import com.springbootpractice.courierdelivery.courierdelivery.model.Courier;
import com.springbootpractice.courierdelivery.courierdelivery.repository.CourierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/couriers")
public class CourierController {

    private final CourierRepository courierRepository;

    @Autowired
    public CourierController(CourierRepository courierRepository) {
        this.courierRepository = courierRepository;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void createCourier(@RequestBody Courier courier){
        courierRepository.save(courier);

    }

    @GetMapping("/{senderName}")
    public List<Courier> findAllCourierBySenderName(@PathVariable String senderName){
        return  courierRepository.findBySenderName(senderName);

    }

    @GetMapping("")
    public List<Courier> getAllCouriers() {
        return courierRepository.findAll();

    }

    @GetMapping("/by-type/{type}")
    public List<Courier> getCouriersByType(@PathVariable CourierType type) {
        return courierRepository.findByType(type);
    }


    @GetMapping("/by-status/{status}")
    public List<Courier> getCouriersByStatus(@PathVariable Status status) {
        return courierRepository.findByStatus(status);

    }


    @PatchMapping("/{id}/status")
    public  ResponseEntity<Courier>updateCourierStatus(@PathVariable Integer id, @RequestParam Status newStatus
    ) {
        Optional<Courier> optionalCourier = courierRepository.findById(id);
        if (optionalCourier.isPresent()) {
            Courier existingCourier = optionalCourier.get();
            Courier updatedCourier = new Courier(
                    existingCourier.id(),
                    existingCourier.title(),
                    existingCourier.senderName(),
                    existingCourier.receiverName(),
                    existingCourier.type(),
                    existingCourier.sourcePinCode(),
                    existingCourier.destinationPinCode(),
                    newStatus
            );
            courierRepository.save(updatedCourier);
            return ResponseEntity.ok(updatedCourier);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
