package org.patterns.service.strategy;

import org.patterns.domain.Notification;
import org.patterns.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;

public class SMSNotification implements NotificationStrategy {
    private final Logger logger = LoggerFactory.getLogger(SMSNotification.class);

    @Override
    public void sendNotification(Notification notification) {
        //logic
        logger.info(MessageFormat.format("SMS message sended to {0}", notification.getDestination()));
    }
}