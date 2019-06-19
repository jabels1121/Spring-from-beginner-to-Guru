package com.jaybe.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("ru")
@Primary
public class PrimaryRussianGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Привет из главного приветственного сервиса";
    }
}
