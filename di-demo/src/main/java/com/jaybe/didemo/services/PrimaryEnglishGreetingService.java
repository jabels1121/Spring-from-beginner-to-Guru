package com.jaybe.didemo.services;

public class PrimaryEnglishGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    public PrimaryEnglishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
