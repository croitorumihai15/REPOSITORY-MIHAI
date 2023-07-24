package com.sda.LOOPS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
        int numar = 10;
        int j;


        //for
        for (j = 1; j <= numar; j++){
            //System.out.println(j);
            System.out.print(j + " ");
        }
        System.out.println();

        //while

        //int i = 1;
        j = 1;
        while (j <= numar) {
            System.out.print(j + " ");
            j ++;
        }
        /*
        //11
        // do while
        do {
            System.out.println(j + " ");
            j++; //12

        }while (j <= numar);

         */
        System.out.println("do while");
        j = 1;
        do {
            System.out.println(j + " ");
            j++; //12

        }while (j <= numar);

        // for
        System.out.println("\nFOR");
        for (int i = numar; i > 0; i--){
            System.out.print(i + " ");
        }

        //WHILE
        System.out.println("\nwhile ");
        int i = numar;
        while (i> 0){
            System.out.print(i + " ");
            i--;
        }

        i = numar;
        // do while
        System.out.println("\ndo while");
        do {
            System.out.print(i + " ");
            i--;

        } while (i >0);

        //afisati toate numerele divizibile cu 3 dintr un interval

        int minNumber = 1;
        int maxNumber = 100;

        // for
        System.out.println("\nfor divizibile cu 3");

        for (i = minNumber; i <= maxNumber; i++) {
            if (i % 3 == 0) { //numarul e divizibile cu 3
                System.out.print(i + " ");
            }
        }

        System.out.println("\nwhile divizibile cu 3 ");
        i = minNumber;
        while (i <= maxNumber) {
            if (i % 3 == 0) { //numarul e divizibile cu 3
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("\ndo while div cu 3");
        i = minNumber;
        do {
            if (i % 3 == 0) { //numarul e divizibile cu 3
                System.out.print(i + " ");
            }
            i++;
        }while (i <= maxNumber);

        // break
        // sa extragem primul numar divizibil cu  dintr un interval
        System.out.println("\nbreak");
        int nr = 0;
        for (int k = minNumber; k <= maxNumber; k++){
            if (k % 5 == 0) {
                nr = k;
                break;
            }
        }

        System.out.println(nr);

        // continue
        // sa afisam toate numerele cu exceptia celor divizibile 5 dintr un interval
        System.out.println("\nCONTINUE");
        for (int l = minNumber; l <= maxNumber; l++) {
            if (l % 5 == 0) {
                continue;
            }
                System.out.print(l+ "  ");

        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nintroduceti valoarea: ");
        int numarCitit = scanner.nextInt();

        System.out.println("introduceti valoarea: ");
        double numarCitit2 = scanner.nextDouble();

        System.out.println("introduceti valoarea: ");
        String textCitit = scanner.next();

        scanner.close();

        System.out.println("ce am citit: " + numarCitit + " " + numarCitit2 + " " + textCitit );





    }
}
