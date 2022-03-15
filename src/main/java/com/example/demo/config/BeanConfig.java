package com.example.demo.config;

import com.example.demo.dto.Demo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean("a")
    public Demo demo() {
        return new Demo("ABC", 10);
    }

    @Bean
    public Demo demo2() {
        return new Demo("EGH", 18);
    }
}
