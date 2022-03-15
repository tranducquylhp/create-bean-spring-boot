package com.example.demo.controller;

import com.example.demo.dto.Demo;
import com.example.demo.dto.Test;
import com.example.demo.dto.Upload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;

@RestController
public class DemoController {
    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);
    @Autowired
    @Qualifier("a")
    private Demo xyz;

    @Autowired
    @Qualifier("testDemo")
    private Test test;

    @Value("${abc.xyz}")
    private String str;

    @GetMapping("demo")
    public Demo demo() {
        return xyz;
    }

    @PostMapping(value="test")
    public ResponseEntity<?> test1(Upload upload) {
        test.setStr(str);
        return new ResponseEntity<>(test, HttpStatus.CREATED);
    }
}
