package it.nowicki.jaroslaw.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController(value = "/index")
public class IndexController {

    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public IndexController( KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping
    public String send() {
        kafkaTemplate.send("test", "test");
        return "OK";
    }
}
