package dev.test;

import org.springframework.web.bind.annotation.GetMapping;

public class Hello {
    @GetMapping(path = "/hello")
    public String Hello() {
        return "Hello!";
    }
}

