package org.patterns.service;

import org.patterns.domain.Notification;

public interface NotificationStrategy {
    void sendNotification(Notification notification);
}
