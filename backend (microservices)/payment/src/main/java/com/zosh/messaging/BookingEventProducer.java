package com.zosh.messaging;

import com.zosh.modal.PaymentOrder;
import com.zosh.payload.dto.BookingDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookingEventProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sentBookingUpdateEvent(PaymentOrder paymentOrder){
        rabbitTemplate.convertAndSend("booking-queue", paymentOrder);
    }
}
