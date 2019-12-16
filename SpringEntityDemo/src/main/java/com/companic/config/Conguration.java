package com.companic.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.companic")
@PropertySource("classpath:user.properties")

public class Conguration {

}
