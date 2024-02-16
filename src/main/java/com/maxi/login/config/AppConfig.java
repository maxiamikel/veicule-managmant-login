package com.maxi.login.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.maxi.login.repositories.VeiculeRepository;
import com.maxi.login.services.impl.VeiculeServiceImmplementation;

@Configuration
public class AppConfig {

    @Bean
    public VeiculeServiceImmplementation veiculeServiceImmplementation(VeiculeRepository veiculeRepository) {
        return new VeiculeServiceImmplementation(veiculeRepository);
    }
}
