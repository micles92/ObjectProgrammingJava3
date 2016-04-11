package com.micles92;

import java.util.Scanner;

/**
 * Created by lesiulol on 09.04.16.
 */
public class Zbior {

    private static final int ROZMIAR = 10;
    private Para tab[];
    Scanner scanner = new Scanner(System.in);

    public Zbior(){
        tab = new Para[ROZMIAR];
    }

    public Zbior(int rozmiar) {
        tab = new Para[rozmiar];
    }


    public Para szukaj(String klucz){
        return null;
    }

    public void wstaw(Para para){
        for(Para x: tab){
            if (para.equals(x)) {
                System.out.println("Para obecnie znajduje sie w zbiorze.");
            }
        }

        System.out.println("Podaj index:");
        int pozycja = scanner.nextInt();
        tab[pozycja] = para;


    }
}
