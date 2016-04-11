package com.micles92;

import java.io.IOException;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by lesiulol on 09.04.16.
 */
public class Main {
    public static int menu() {
        System.out.println();
        System.out.println("     ****************************************");
        System.out.println("     *                  MENU                *");
        System.out.println("     ****************************************");
        System.out.println("     1. Wstaw pare.");
        System.out.println("     0. Koniec");

        Scanner in = new Scanner(System.in);
        int w = in.nextInt();

        return w;
    }


    public static void main(String[] args) throws IOException {
        Zbior zbior = new Zbior(44);

        Scanner scanner = new Scanner(System.in);
        int index;


        int wybor = menu();

        while (wybor != 0) {
            switch (wybor){
                case 1:
                   // System.out.println("Wstawianie pary.");

                    System.out.println("Podaj klucz");
                    String klucz = scanner.nextLine();

                    System.out.println("Podaj wartosc");
                    Double wartosc = scanner.nextDouble();


                    zbior.wstaw(new Para(klucz, wartosc));

                    break;
                case 2:
                    break;

            }

            System.out.println("\nWciśnij Enter, aby kontynuować...");
            System.in.read();

            wybor = menu();
        }
    }
}