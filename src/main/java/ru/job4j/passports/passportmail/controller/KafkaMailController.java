package ru.job4j.passports.passportmail.controller;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMailController {

    @KafkaListener(topics = {"unavailable-passports"})
    public void onApiCall(ConsumerRecord<Integer, String> input) {
        System.out.printf("%n------- Send mail ------- %n%s%n%n", input.value());
    }
}
