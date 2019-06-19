package com.jaybe.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"de", "default"})
public class GermanGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hallo aus deutschland grußdienst!";
    }
}
