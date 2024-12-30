package org.csystem.app.configuration.datetime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;

@Configuration
public class DateConfig {
    @Bean("date.create")
    @Scope("prototype")
    public LocalDate createNow()
    {
        System.out.println("DateConfig.createNow");
        return LocalDate.now();
    }
}
