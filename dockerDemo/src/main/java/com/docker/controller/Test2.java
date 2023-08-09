package com.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test2")
public class Test2 {

    @GetMapping("/hello")
    public String test() {
        return "Hello Docker";
    }

<<<<<<< HEAD
    @GetMapping("/bye")
=======
@GetMapping("/bye")
>>>>>>> 269a3438b4998ae06bf996b3a4a7899d74da941e
    public String test1() {
        return "Bye Docker";
    }
}
