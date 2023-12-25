package com.FCAI.OrdersAndNotifications.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/")
    String testGet() {
        return "Hello saikoo Get";
    }

    @PostMapping("/")
    String testPost() {
        return "Hello saikoo Post";
    }

    @DeleteMapping("/")
    String testDelete() {
        return "Hello saikoo Delete";
    }
}
