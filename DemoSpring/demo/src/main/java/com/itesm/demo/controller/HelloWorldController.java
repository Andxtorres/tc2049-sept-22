package com.itesm.demo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {

    @GetMapping("/hello-world")
    public ResponseEntity<String> sayHello(){
        return new ResponseEntity<>("Hola",HttpStatus.OK);
    }
}
