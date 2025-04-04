package org.patterns.service.strategy;

import org.patterns.domain.Notification;
import org.patterns.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;

public class DiscordNotification implements NotificationStrategy {
    private final Logger logger = LoggerFactory.getLogger(DiscordNotification.class);

    @Override
    public void sendNotification(Notification notification) {
        //logic
        logger.info(MessageFormat.format("Discord message sended to {0}", notification.getDestination()));
    }
}