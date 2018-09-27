package com.alex.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmqpRefreshApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(AmqpRefreshApp.class, args);
    }
}
