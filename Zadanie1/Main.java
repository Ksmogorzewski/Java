package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.spi.AbstractResourceBundleProvider;

public class Main {

    public static void main(String[] args) {
        System.out.println("Witaj");
        int min = 10;
        int max = 1500;
        double kwota = Math.round(Math.random()*(max-min+1)+min);
        System.out.println("Do zapłaty: " + kwota);

        Scanner scn = new Scanner(System.in);
        System.out.println("Wybierz rodzaj płatności (1-gotowka,2-karta,3-blik): ");
        String rodzaj = scn.nextLine();

        while (true){
            if(rodzaj.equals("1") || rodzaj.equals("2") || rodzaj.equals("3")){
                System.out.println("OK");
                break;
            }else {
                System.out.println("Wybierz rodzaj płatności (1-gotowka,2-karta,3-blik): ");
                rodzaj = scn.nextLine();
            }
        }

        switch (rodzaj) {
            case "1":
                System.out.println("wybrano gotowke");
                System.out.println("Podaj banknoty: ");
                String banknoty = scn.nextLine();
                String []tablica = banknoty.split(";");
                int i;
                Integer suma = 0;
                for(i=0; i < tablica.length; i++ ){
                    suma = suma + Integer.parseInt(tablica[i]);
                }
                if (suma > kwota) {
                    System.out.println("Reszta: " + (suma - kwota));
                    System.out.println("Koniec transakcji.");
                } else if (suma == kwota) {
                    System.out.println("Równa kwota, koniec transakcji.");
                } else {
                    while (suma < kwota) {
                        System.out.println("Dołóż banknotów");
                        System.out.println("Podaj dodatkowe banknoty: ");
                        String banknoty2 = scn.nextLine();
                        String []tablica2 = banknoty2.split(";");
                        for(i=0; i < tablica2.length; i++ ){
                            suma = suma + Integer.parseInt(tablica2[i]);
                        }
                    }
                    System.out.println("Reszta: " + (suma - kwota));
                    System.out.println("Koniec transakcji.");
                }
                break;
            case "2":
                System.out.println("karta");
                break;
            case "3":
                System.out.println("Blik");
                break;
        }
    }
}
