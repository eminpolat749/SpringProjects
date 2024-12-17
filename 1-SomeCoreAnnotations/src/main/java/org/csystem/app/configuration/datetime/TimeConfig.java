package org.csystem.app.configuration.datetime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class TimeConfig {
    @Bean
    public LocalTime createNow()
    {
        System.out.println("TimeConfig.createNow");

        return LocalTime.now();
    }
}
