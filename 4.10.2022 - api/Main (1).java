package com.company;


public class Main {
    public static void main(String[] args) {
        /*User user1 = new User();
        System.out.println(user1.name);*/
        User user2 = new User(1, "Jan1", "Kowalski1", "k@gmail.com", "1111", 1);
        System.out.println(user2.name);//jan1
    }
}
/*"id" : "1"
"name" : "Jan1"
"surname" : "Kowalski1"
"email" : "k@gmail.com"
"password" : "1111"
"role" : "1"*/
