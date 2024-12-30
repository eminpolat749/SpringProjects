package org.csystem.app.configuration.datetime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalTime;

@Configuration
public class TimeConfig {
    @Bean("time.create")
    @Scope("prototype")
    public LocalTime createNow()
    {
        System.out.println("TimeConfig.createNow");

        return LocalTime.now();
    }
}
