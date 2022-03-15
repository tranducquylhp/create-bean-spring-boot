package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component("testDemo")
@Primary
@NoArgsConstructor
public class Test {
    private String str;
}
