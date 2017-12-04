package it.nowicki.jaroslaw.controllers;

import it.nowicki.jaroslaw.events.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/index")
public class IndexController {

    @Autowired
    private Sender sender;

    @GetMapping
    public String test() {
        sender.send("test", "dziala");
        return "OK";
    }
}
