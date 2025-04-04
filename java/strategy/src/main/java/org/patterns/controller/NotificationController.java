package org.patterns.controller;

import org.patterns.controller.dto.NotificationDTO;
import org.patterns.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<?> send(@RequestBody NotificationDTO notificationDTO) {
        notificationService.send(notificationDTO.toNotification());

        return ResponseEntity.status(HttpStatus.NO_CONTENT.value()).build();
    }
}
