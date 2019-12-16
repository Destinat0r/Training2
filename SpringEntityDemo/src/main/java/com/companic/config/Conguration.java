package com.companic.config;

import com.companic.entity.Account;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.companic")
@PropertySource("classpath:user.properties")

public class Conguration {

    @Bean
    public Account account() {
        return new Account("aleglock87@motmail.com", "masterhunter87", "paswword123 ");
    }
}
