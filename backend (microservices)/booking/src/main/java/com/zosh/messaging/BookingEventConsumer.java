package com.zosh.messaging;


import com.zosh.modal.PaymentOrder;

import com.zosh.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookingEventConsumer {

    @Autowired
    private BookingService bookingService;

    @RabbitListener(queues = "booking-queue")
    public void bookingUpdateListener(PaymentOrder paymentOrder){

        System.out.println("Received message: " + paymentOrder);

        bookingService.bookingSucess(paymentOrder);

        System.out.println("Received message: " + paymentOrder);

    }
}
