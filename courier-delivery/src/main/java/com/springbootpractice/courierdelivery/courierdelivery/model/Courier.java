package com.springbootpractice.courierdelivery.courierdelivery.model;

import com.springbootpractice.courierdelivery.courierdelivery.enums.CourierType;
import com.springbootpractice.courierdelivery.courierdelivery.enums.Status;

public record Courier(

        Integer id,

        String title,
        String senderName,

        String receiverName,

        CourierType type,

        Integer sourcePinCode,

        Integer destinationPinCode,

        Status status


) {
}
