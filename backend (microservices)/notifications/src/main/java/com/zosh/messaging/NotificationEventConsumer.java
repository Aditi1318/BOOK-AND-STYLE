package com.zosh.messaging;

import com.zosh.modal.Notification;
import com.zosh.payload.dto.BookingDTO;
import com.zosh.payload.dto.NotificationDTO;
import com.zosh.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationEventConsumer {

    @Autowired
    private NotificationService notificationService;

    @RabbitListener(queues = "notification-queue")
    public void sentBookingUpdateEvent(Notification notification){
        notificationService.createNotification(notification);
    }

}
