package it.nowicki.jaroslaw.events;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TestListener {

    @KafkaListener(topics = "test")
    public void rev(String t) {
        System.out.println(t);
    }

}
