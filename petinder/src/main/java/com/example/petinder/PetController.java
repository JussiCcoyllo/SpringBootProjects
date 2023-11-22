package com.example.petinder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pets")
public class PetController {

    @GetMapping("/hello")
    public void helloPets(){
        System.out.println("Hello Pets!");
    }
}
