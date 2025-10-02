package com.zosh.messaging;


import com.zosh.payload.dto.NotificationDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationEventProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sentNotificationEvent(Long bookingId,
                                      Long userId,
                                      Long salonId) {
        NotificationDTO notification=new NotificationDTO();
        notification.setBookingId(bookingId);
        notification.setSalonId(salonId);
        notification.setUserId(userId);
        notification.setDescription("new booking got confirmed");
        notification.setType("BOOKING");

        rabbitTemplate.convertAndSend("notification-queue", notification);

    }
}
