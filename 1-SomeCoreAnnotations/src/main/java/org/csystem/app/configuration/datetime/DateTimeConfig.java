/*----------------------------------------------------------------------------------------------------------------------
    Bean ile işaretlendiği için LocalDateTime'ı yaratmak için bu metodu çağıracak
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.configuration.datetime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


import java.time.LocalDateTime;

@Configuration
public class DateTimeConfig {
    @Bean("datetime.create")
    @Scope("prototype")
    public LocalDateTime createNow()
    {
        System.out.println("DateTimeConfig.createNow()");
        return LocalDateTime.now();
    }
}
