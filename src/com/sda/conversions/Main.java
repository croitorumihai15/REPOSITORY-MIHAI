package com.sda.conversions;

public class Main {
    public static void main(String[] args) {
        // conversii implicite

        // byte -> short

        byte numarbyte1 = 10; //-128 - 127
        short numarshort1 = numarbyte1;
        System.out.println(numarshort1);
        System.out.println(numarbyte1);

        // shhort -> int

        short numarshort2 = 100;
        int numarint1 = numarshort2;
        System.out.println(numarint1);
        System.out.println(numarshort2);

        // int - long

        long numarlong1 = numarint1;
        System.out.println(numarlong1);

        // float - double;
        float numarfloat1 = 3.14f;
        double numardouble1 = numarfloat1;
        System.out.println(numardouble1);
        System.out.println(numarfloat1);
        System.out.printf("%.2f", numardouble1);
        System.out.print("\n");
        System.out.print("\n");

        int a = 5;
        System.out.printf("%d", a);
        System.out.print("\n");
        System.out.println();

        //char -> int
        char chA = 'A';
        chA = 'a';
        int codA = chA;
        System.out.println(chA);
        System.out.println(codA);

        //int ->float
        int numarint2 = 123456789;
        float numarfloat2 = numarint2;
        System.out.println(numarint2);
        System.out.println(numarfloat2);
        System.out.printf("%.2f", numarfloat2);

        System.out.println("\n");

        // long - float
        long numarlong2 = 123456789L;
        float numarfloat3 = numarlong2;
        System.out.println(numarlong2);
        System.out.println(numarfloat2);
        System.out.printf("%.2f", numarfloat2);

        System.out.println("\n");

        //rezolvare : sa avem o variabila de tip double, nu una de tip float
        double numardouble2 = numarlong2;
        System.out.println(numarlong2);
        System.out.println(numarfloat2);
        System.out.printf("%.2f", numarfloat2);

        System.out.println("\n");

        //LONG - DOUBLE
        long numarlong3 = 123456789123456789L;
        double numardouble3 = numarlong3;
        System.out.println(numarlong3);
        System.out.println(numardouble3);
        System.out.printf("%.2f", numardouble3);

        System.out.println("\n\nconversii explicite (cast)");

        //int  - byte
        int numarint3 = 200;
        byte numarbyte2 = (byte)numarint3;
        System.out.println(numarbyte2);

        //200 -128 = 72
        //72 - 128 = -56

        //long - int
        long numarlong4 = 12345678L;
        int numarint4 = (int)numarlong4;
        System.out.println(numarlong4);

        //float - long
        float numarfloat4 = 3.14f;
        long numarlong5 = (long)numarfloat4;
        System.out.println(numarlong5);

        // double - float
        double numardouble4 =3.145465465D;
        float numarfloat5 = (float)numardouble4;
        System.out.println(numarfloat5);

        //char - byte
        char ch1 = 200;
        byte numarbyte3 = (byte)ch1;
        System.out.println(numarbyte3);







    }
}
