package com.vilonov.myWeb;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping(path = "/home", produces = MediaType.TEXT_PLAIN_VALUE)
    public String home() {
        return "<h1 style=\"align-self: center;\">Home</h1>\n" +
                "<p>\n" +
                "    Home page.\n" +
                "</p>";
    }

    @GetMapping(path = "/about", produces = MediaType.TEXT_PLAIN_VALUE)
    public String about() {
        return "<h1 style=\"align-self: center;\">About</h1>\n" +
                "<p>\n" +
                "    About page.\n" +
                "</p>";
    }

    @GetMapping(path = "/contact", produces = MediaType.TEXT_PLAIN_VALUE)
    public String contact() {
        return "<h1 style=\"align-self: center;\">Contact</h1>\n" +
                "<p>\n" +
                "    Contact page.\n" +
                "</p>";
    }

}

