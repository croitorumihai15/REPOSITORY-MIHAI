package com.sda.Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //tablouri unidimensionale

        int[] numere1;
        numere1 = new int[4];

        int[] numere = new int[4]; // 0 0 0 0

        int[] numere2 ={10,20,30,40,50}; // 10 20 30 40 50

        int[] numere3 = new int[]{1,2,3}; // 1 2 3

        System.out.println(numere2[1]);
        numere[0] = 100;
        numere3[2] = 4;

        //numere3[3] = 0; exceptie - PANICA

        //FOR

        System.out.println("elementele array ului ");
        for (int i = 0; i < numere.length; i++) {
            System.out.print(numere[i] + " ");
        }

        // foreach
        System.out.println("\nparcurgere cu foreach");
        for (int element : numere2) {
            System.out.print(element + " ");
        }
        System.out.println();

        int i = 0 ;
        while ( i < numere3.length) {
            System.out.print(numere3[i] + " ");
            i++;
        }

        String[] numePersoane = new String[3];
        numePersoane[0] = "ION";
        numePersoane[1] = "ANA";
        numePersoane[2] = "Gigel";
        System.out.println("\nstring array: ");
        for (String nume : numePersoane) {
            System.out.println(nume + "; ");
        }

        //String salut = new String( original : "salut ")


        /* int lungime;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti lungimea array-ului: ");

        lungime = scanner.nextInt();

        int [] num = new int[lungime];

        for(int k = 0; k < num.length; k++) {
            System.out.println("introduceti elementul de pe pozitia: " + k);
            num[k] = scanner.nextInt();

        }
        scanner.close();
        System.out.println("\nstring array ul citit: ");
        for (int element : num) {
            System.out.println(element + "; ");
        }

         */

        //tablouri bidimensionale
        double[][] matrice = {{10.2,5.5}, {2.2,15.7,9.9}};

        //System.out.println(matrice[1][2]);

        //  parcurgerea elementelor:
        for (int a = 0; a < matrice.length; a++) { // parcurge liniile
            for(int b = 0; b < matrice[a].length; b++) {
                System.out.print(matrice[a][b] + " ");
            }
            System.out.println();
        }






    }
}
