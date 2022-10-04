package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scn = new Scanner(System.in);
    static  double amount = new Random().nextInt(100000)/100.0;

    public static void main(String[] args) {
	    pay();
    }

    private static void pay() {
        int pamentMethodValue = getPaymentMethodFromKeyboard();
        switch (pamentMethodValue){
            case 1:
                if (payCach()){
                    printReceipt();
                } else {
                    pay();
                }
                break;
            case 2:
                payBlik();
                break;
            case 3:
                payCard();
                break;
            default:
                pay();
                break;
        }
    }

    private static void printReceipt() {
        System.out.println("Reszta="+(-amount)+". Drukowanie paragonu.");
    }

    private static int getPaymentMethodFromKeyboard(){
        int pamentMethodValue = 0;
        System.out.println("do zaplaty: " + amount);
        System.out.println("wybierz sposob platnosci: ");
        System.out.println("1-gotowka\n2-blik\n3-karta");
        String pamentMethod =scn.nextLine();
        try {
            pamentMethodValue = Integer.parseInt(pamentMethod);
        } catch (NumberFormatException e) {
            pamentMethodValue = getPaymentMethodFromKeyboard();
        }
        return pamentMethodValue;
    }

    private  static boolean payCach(){
        while (amount > 0) {
            int banknotesAmount = getBanknotesAmount();
            if (banknotesAmount == 0){
                return  false;
            } else {
                amount -= banknotesAmount;
            }
        }
        if (amount > 0) payCach();
        return true;
    }

    private static int getBanknotesAmount() {
        int banknoteAmount = 0;
        System.out.println("Do zapłaty: " + amount);
        System.out.println("Podaj banknoty: ");
        String decision = scn.nextLine();
        if (decision.equals("X")){
            System.exit(0);
        }else if (decision.equals("Z")){
            return 0;
        } else {
            String[] banknotesArray = decision.split(";");
            /*int i = 0;
            while (i < banknotesArray.length) {
                banknoteAmount += Integer.parseInt(banknotesArray[i]);
                i++;
            }*/
            for(String banknote : banknotesArray){
                banknoteAmount += Integer.parseInt(banknote);
            }

        }

        return banknoteAmount;
    }

    private  static boolean payBlik(){
        return true;
    }

    private  static boolean payCard(){
        return true;
    }
}
