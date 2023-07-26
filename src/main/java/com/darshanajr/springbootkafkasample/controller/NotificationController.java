package com.darshanajr.springbootkafkasample.controller;

import com.darshanajr.springbootkafkasample.dao.Email;
import com.darshanajr.springbootkafkasample.dao.SMS;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notifications")
@RequiredArgsConstructor
public class NotificationController {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @PostMapping("/email")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void sendEmail(@RequestBody Email email) {
        kafkaTemplate.send("notificationQueue", email);
    }

    @PostMapping("/sms")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void sendSMS(@RequestBody SMS sms) {
        kafkaTemplate.send("notificationQueue", sms);
    }
}
