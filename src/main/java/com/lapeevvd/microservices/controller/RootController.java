package com.lapeevvd.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/")
public class RootController {

    @GetMapping
    public String getApplicationInfo() throws UnknownHostException {
        return "Hello world from " + InetAddress.getLocalHost().getHostName();
    }
}
