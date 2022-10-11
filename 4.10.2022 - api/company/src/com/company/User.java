package com.company;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class User {
    public User(int id, String name, String surname, String email, String password, int role){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.password=password;
        this.role=role;
    }
    private int id;
    public String name;
    private String surname;
    private String email;
    private String password;
    private int role;
}
