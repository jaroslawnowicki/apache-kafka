package it.nowicki.jaroslaw.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jarek on 19.09.17.
 */
@RestController(value="/index")
public class IndexController {

    @GetMapping
    public String receiver() {

        return "OK";
    }
}
