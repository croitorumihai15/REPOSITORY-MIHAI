package com.sda.variables;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!"); //comentariu pe o linie
        /*comentariu
        pe mai multe liniiiiiiiiiiii
         */


        System.out.print("Numele meu este ");
        System.out.println("MIHAI");

        System.out.println("\n Numele meu este " + "BOGDA NELU");

        //variabile cu tipuri de date primitive
        //byte, short, int, long, float, double, char, boolean

        byte byteNo1; // DOAR initializare
        byteNo1 = 1;  // DOAR atribuire folosind operatorul =

        //memorie 16 biti = 2 bytes
        short shortVar = -510; // initializare si atribuire

        //memorie =32 biti = 4 bytes
        int temparaturaDeAfara = 26;

        long longNO = 1234567890L;

        //memorie = 32biti = 4 bytes
        float inaltime1 = 1.8f;

        //memorie = 64 biti = 8bytes;
        double inaltime2 = 1.6;

        System.out.println(temparaturaDeAfara + " \u0366C");

        // memorie = 16 biti = 2 bytes
        char a = 'A', b;
        b = 'B';

        System.out.println(b);
        b = 'b';
        b = a;
        System.out.println(b);

        char copyright = '\u00A9';
        copyright = '\u00AE';
        System.out.println(copyright);

        //1 bit -0 sau 1 : 0 pt fals, 1 - true
        boolean isRed = true;
        System.out.println("butonul este rosu? " + isRed);

        // tipuri de date referentiale - String
        String nume = "Miiiiiiihai";
        System.out.println("numele meu este " + nume);

        nume = "gigel";
        System.out.println("numele meu este " + nume);

        long numarlong = 1_000_000_000l;
        System.out.println(numarlong);

        char new_line = '\n';
        System.out.println("java este " + new_line + "fun");

        System.out.println(nume.length());




    }
}