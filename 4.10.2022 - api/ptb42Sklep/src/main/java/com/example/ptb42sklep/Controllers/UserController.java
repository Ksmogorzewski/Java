package com.example.ptb42sklep.Controllers;

import com.example.ptb42sklep.Models.User;
import com.example.ptb42sklep.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    //"", "/liczba"

    @Autowired
    UserRepository us;

    @GetMapping("")
    public String s(){
        return "<h1>nic</h1>";
    }
    @GetMapping("/liczba")
    public int n(){
        return 324;
    }


    @GetMapping("/api/users")
    public List<User> getAll(){
        return us.getAllUsers();
    }

    @GetMapping("/api/users/{id}")
    public User getUserById(@PathVariable("id") int id){
        return us.getUserbyId(id);
    }

    @PostMapping("/api/users/add")
    public String insertUsers(@RequestBody List<User> users){
        us.insertUsers(users);
        return "zaraz dodam. TODO INSERT";
    }
}
