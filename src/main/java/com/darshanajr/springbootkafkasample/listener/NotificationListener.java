package com.darshanajr.springbootkafkasample.listener;

import com.darshanajr.springbootkafkasample.dao.Email;
import com.darshanajr.springbootkafkasample.dao.SMS;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@KafkaListener(topics = "notificationQueue")
public class NotificationListener {

    @KafkaHandler
    public void listenToEmail(Email email) {
        log.info("Processing email {}", email);
    }

    @KafkaHandler
    public void listenToSMS(SMS sms) {
        log.info("Processing sms {}", sms);
    }
}
