package com.companic.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Value("${user.id}")
    private int id;

    @Value("${user.first_name}")
    private String firstName;

    @Value("${user.last_name}")
    private String lastName;

    

}
