package com.sda.statics;

import com.sda.OOP.Dog;

import static java.lang.Math.*;
import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {
        new Dog();

        System.out.println(Dog.isCute);
        Dog.isCute();
        Dog.isCute();
        System.out.println(Dog.isCute);


        double temp = 35;
        if (temp < TEMPERATURA_FIERBERE) {
            System.out.println("nu fierb");
        } else {
            System.out.println("fierbe");
        }

        double raza = 5.0;
        double aria = PI * pow(raza, 2);

        System.out.printf("aria este ", aria);



        //clasa imbricata
        ClasaExterioara exterioara = new ClasaExterioara();
        ClasaExterioara.ClasaImbricata inner = exterioara.new ClasaImbricata();
        inner.afisare();

        // clase statice
        ClasaExterioara.ClasaStatica clasaStatica = new ClasaExterioara.ClasaStatica();
        clasaStatica.afisare();

        if(Dog.JUCAUS_TARE){
            System.out.println(Dog.MAX_SATISF);
        }

        final double temperaturaInghet = 0 ;



    }


    static final int TEMPERATURA_FIERBERE = 100; //CONSTANTA SI NU POATE FI MODIFICATA
}
