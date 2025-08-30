package com.payment.fraud.auth;


import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.security.SecureRandom;
import java.util.Base64;

@SpringBootApplication
public class FraudDetectionApplication {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        SpringApplication.run(FraudDetectionApplication.class, args);
    }
}