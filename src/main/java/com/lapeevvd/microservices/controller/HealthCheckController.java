package com.lapeevvd.microservices.controller;

import com.lapeevvd.microservices.util.HealthCheckStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public String healthCheck() {
        return HealthCheckStatus.OK;
    }
}
