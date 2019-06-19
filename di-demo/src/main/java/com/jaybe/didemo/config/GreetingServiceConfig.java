package com.jaybe.didemo.config;

import com.jaybe.didemo.services.GreetingRepository;
import com.jaybe.didemo.services.GreetingService;
import com.jaybe.didemo.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    private final GreetingRepository greetingRepository;

    public GreetingServiceConfig(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository){
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    public GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    public GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("es");
    }

    @Bean
    @Primary
    @Profile("de")
    public GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("de");
    }
}
