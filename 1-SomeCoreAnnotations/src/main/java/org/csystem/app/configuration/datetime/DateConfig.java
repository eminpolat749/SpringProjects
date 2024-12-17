/*----------------------------------------------------------------------------------------------------------------------
    Bean ile işaretlendiği için LocalDate'i yaratmak için bu metodu çağıracak
----------------------------------------------------------------------------------------------------------------------*/

package org.csystem.app.configuration.datetime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DateConfig {
    @Bean
    public LocalDate createNow()
    {
        System.out.println("DateConfig.now");
        return LocalDate.now();
    }
}
