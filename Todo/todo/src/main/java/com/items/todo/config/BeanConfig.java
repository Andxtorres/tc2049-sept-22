package com.items.todo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class BeanConfig {

    @Bean
    BCryptPasswordEncoder createBeanEncoder(){
        return new BCryptPasswordEncoder();
    }
}
