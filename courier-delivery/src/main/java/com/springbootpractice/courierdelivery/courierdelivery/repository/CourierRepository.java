package com.springbootpractice.courierdelivery.courierdelivery.repository;

import com.springbootpractice.courierdelivery.courierdelivery.enums.CourierType;
import com.springbootpractice.courierdelivery.courierdelivery.enums.Status;
import com.springbootpractice.courierdelivery.courierdelivery.model.Courier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class CourierRepository {

    private final  List<Courier> courierList = new ArrayList<>();

    public Courier save(Courier courier) {
        this.courierList.removeIf(c -> c.id().equals(courier.id()));
        courierList.add(courier);
        return courier;
    }

    public List<Courier> findAll() {
        return courierList;
    }
    public List<Courier> findBySenderName(String senderName) {
        return courierList.stream()
                .filter(courier -> courier.senderName().equalsIgnoreCase(senderName))
                .collect(Collectors.toList());
    }


    public List<Courier> findByStatus(Status status) {
        return courierList.stream()
                .filter(courier -> courier.status() == status)
                .collect(Collectors.toList());
    }



    public boolean existsById(Integer id){
        return courierList.stream().filter(c -> c.id().equals(id)).count() == 1;
    }


    public Optional<Courier> findById(Integer id) {
        return courierList.stream().filter(c -> c.id().equals(id)).findFirst();

    }

    public List<Courier> findByType(CourierType type) {
        return courierList.stream()
                .filter(courier -> courier.type() == type)
                .collect(Collectors.toList());
    }
}
