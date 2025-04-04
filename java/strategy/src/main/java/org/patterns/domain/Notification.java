package org.patterns.domain;

public class Notification {

    private String channel;
    private String destination;
    private String message;

    public Notification(String channel, String destination, String message) {
        this.channel = channel;
        this.destination = destination;
        this.message = message;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
