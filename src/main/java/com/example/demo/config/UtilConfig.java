package com.example.demo.config;

import com.example.demo.dto.Demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class UtilConfig {
    @Bean("demo1")
    @Primary
    public Demo demo() {
        return new Demo("XYZ", 20);
    }
}
