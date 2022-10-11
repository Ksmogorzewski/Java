package com.company;

public class Main {
    public static void main(String[] args){
        /*User user1 = new User();
        System.out.println(user1.name);*/
        User user2 =new User(1,
                "Jan1",
                "Dobrowolski1",
                "jan1@gmail.com",
                "1111",
                1);
        System.out.println(user2.name);
    }
}
