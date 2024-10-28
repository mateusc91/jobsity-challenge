package com.example.jobsitychallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JobsityChallengeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobsityChallengeApplication.class, args);
    }

}
