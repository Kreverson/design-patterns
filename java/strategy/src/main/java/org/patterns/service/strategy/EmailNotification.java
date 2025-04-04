package org.patterns.service.strategy;

import org.patterns.domain.Notification;
import org.patterns.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;

public class EmailNotification implements NotificationStrategy {
    private final Logger logger = LoggerFactory.getLogger(EmailNotification.class);

    @Override
    public void sendNotification(Notification notification) {
        //logic
        logger.info(MessageFormat.format("Email message sended to {0}", notification.getDestination()));
    }
}
