package org.patterns.service;

import org.patterns.domain.Notification;
import org.patterns.service.strategy.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NotificationService {
    private final Map<String, NotificationStrategy> mapStrategy = Map.of(
            "email", new EmailNotification(),
            "sms", new SMSNotification(),
            "whatsapp", new WhatsAppNotification(),
            "discord", new DiscordNotification(),
            "twitter", new TwitterNotification()
    );
    private final Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);

    public void send(Notification notification) {
        var instance = mapStrategy.get(notification.getChannel().toLowerCase());

        if(instance != null)
            instance.sendNotification(notification);
    }

}
