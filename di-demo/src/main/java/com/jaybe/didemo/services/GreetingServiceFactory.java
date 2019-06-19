package com.jaybe.didemo.services;

public class GreetingServiceFactory {

    private final GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new PrimaryEnglishGreetingService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            case "ge":
                return new PrimaryGermanGreetingService(greetingRepository);

            default:
                return new PrimaryEnglishGreetingService(greetingRepository);
        }
    }
}
