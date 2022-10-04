package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Table1Controller {
    @GetMapping("")
    public String main(){
        return "<h1>Main Page 4PTB2</h1>";
    }
    @GetMapping("/api/test1")
    public int test1() {
        return 500;
    }

    @GetMapping("/api/table1")
    public int showtable1(){
        return 10;
    }
}
