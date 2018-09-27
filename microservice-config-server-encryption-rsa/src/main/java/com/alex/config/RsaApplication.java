package com.alex.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RsaApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(RsaApplication.class, args);
    }
}
