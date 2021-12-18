package com.practice.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallbackMethod() {
        return "User Service is taking longer than expected. " +
                "Please try after some time!";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallbackMethod() {
        return "Department Service is taking longer than expected. " +
                "Please try after some time!";
    }
}
