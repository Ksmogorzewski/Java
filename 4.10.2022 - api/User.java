package com.company;

//@Data
//@AllArgsConstuctor
//@NoArgsConstuctor
public class User {
    public User() {
        //this.name = "Test";
    }
    public User(int id, String name, String surname, String email, String pass, int r) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = pass;
        this.role = r;
    }
    private int id;
    public String name;
    private String surname;
    private String email;
    private String password;
    private int role;
}
