package com.company;
import java.util.Scanner;
import static java.lang.Math.*;
public class Krok {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int krok = scn.nextInt();
        int max = scn.nextInt();
        for (int i = 0; i < max; i+=krok) {
            System.out.println(i);
        }
        System.out.print("\n\n\n\n\n");
        int i = 0;
        while(i < max) {
            System.out.println(i);
            i+=krok;
        }
        i = 0;
        do {
            System.out.println(i);
            i+=krok;
        }while(i < max);
    }
}