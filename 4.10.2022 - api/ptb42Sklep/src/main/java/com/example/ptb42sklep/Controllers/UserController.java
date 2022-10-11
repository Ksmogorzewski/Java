package com.example.ptb42sklep.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //"", "/liczba"

    @GetMapping("")
    public String s(){
        return "<h1>nic</h1>";
    }
    @GetMapping("/liczba")
    public int n(){
        return 324;
    }
}
