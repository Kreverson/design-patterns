package org.patterns.controller.dto;

import org.patterns.domain.Notification;

public record NotificationDTO(String channel,
                              String destination,
                              String message) {

    public Notification toNotification() {
        return new Notification(this.channel, this.destination, this.message);
    }
}
