package com.example.sklep4ptb2.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    public String name;
    private String surname;
    private String email;
    private String password;
    private int role;
}
