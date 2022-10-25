package com.example.sklep4ptb2.Controllers;

import com.example.sklep4ptb2.Models.User;
import com.example.sklep4ptb2.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api/users")
@RestController
public class UserController {
    @Autowired
    UserRepository ur;

    @GetMapping("")//localhost:8080/api/users
    public List<User> getAll() {
        return ur.getAllUsers();
    }

    @GetMapping("/{id}")//localhost:8080/api/users/id
    public User getUserById(@PathVariable("id") int id) {
        return ur.getUserById(id);
    }

    @PostMapping("")
    public String insertUsers(@RequestBody List<User> users) {
        ur.insertUsers(users);
        return "OK";
    }

    @DeleteMapping("/{id}")
    public int deleteUser(@PathVariable("id") int id){
        return ur.deleteUser(id);
    }

    @PutMapping("/{id}")
    public int updateUser(@PathVariable("id") int id, @RequestBody User updateUser) {
        User user = ur.getUserById(id);
        if (user != null) {
            user.setId(id);
            return ur.updateUsers(updateUser);
        }
        return -1;
    }

    @PatchMapping("/{id}")
    public int patchUpdateUser(@PathVariable("id") int id, @RequestBody User updatedUser){
        User user = ur.getUserById(id);
        if (user != null) {
            updatedUser.setId(id);
            if (updatedUser.getName() != null){
                updatedUser.setName(user.getName());
            }
            if (updatedUser.getSurname() != null){
                updatedUser.setSurname(user.getSurname());
            }
            if (updatedUser.getEmail() != null){
                updatedUser.setEmail(user.getEmail());
            }
            if (updatedUser.getPassword() != null){
                updatedUser.setPassword(user.getPassword());
            }
            if (updatedUser.getRole() != 0){
                updatedUser.setRole(user.getRole());
            }
            return ur.updateUsers(updatedUser);
        }
        return -1;
    }
}