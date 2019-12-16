package com.companic;

import com.companic.config.Conguration;
import com.companic.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conguration.class);

        User user = context.getBean("user", User.class);

        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getId());
    }
}
