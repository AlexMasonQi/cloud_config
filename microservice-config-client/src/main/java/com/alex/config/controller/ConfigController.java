package com.alex.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController
{
    @Value("${spring.cloud.config.profile}")
    private String profile;

    @GetMapping("/profile")
    public String hello()
    {
        System.out.println("Success");
        return profile;
    }
}
