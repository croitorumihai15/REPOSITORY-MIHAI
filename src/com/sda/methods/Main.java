package com.sda.methods;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.5;

        //double sum1 = a+b;
        double sum1 = sumaNumerelor(a,b) ;

        int c =2;
        //double sum2 = sum1 + c;

        System.out.println(sumaNumerelor(c,sum1));
        System.out.println(sumaNumerelor(c,sumaNumerelor(a,b)));

        String s = "Java";
        afisareMesaj(s);

        System.out.println(sumaNumerelor(a,1,c));
        System.out.println(sumaNumerelor(a,c));

        boolean isHot = eFoarteCaldAfara(28);
        if (isHot){
            System.out.println("e foarte cald afara");
        } else{
            System.out.println("afara e racoare");
        }

        int su = 0;
        for(int i = 0; i < 5 ; i++){
            su += sumaNumerelor(i,i+1);
        }
        System.out.println(su);
        System.out.println(sumaVarargs(1,2));
        System.out.println(sumaVarargs(2.2,5.3,7,4.1));
        System.out.println(medie("hello",2.2,5.3,7,4.1));
        System.out.println(sumaInterval(1,5));



    }

    static double sumaNumerelor(int x, double y){
        //double s = x + y;
        return x + y;
    }

    static void afisareMesaj(String s) {
        System.out.println("Hello from method, " + s + "!");
    }

    static double sumaNumerelor(int x, int y, int z) {
        return x + y + z;
    }
    static int sumaNumerelor(int x, int y){
        return x + y;
    }

    static boolean eFoarteCaldAfara(double temperatura){
        if(temperatura > 25) {
            return true; // se returneaza si se termina metoda
        }
        return false;
    }

    static double sumaVarargs(double...numere){ // double[] numere;
        double rezultat = 0;
        for (double nr:
            numere ) {
                rezultat += nr; // rezultat = rezultat + nr
                    }
        return rezultat;
    }

    static double medie (String mesaj, double...numere){
        System.out.println(mesaj);
        return sumaVarargs(numere) / numere.length;
    }

    static double sumaInterval(int nrMIN, int nrMAX) {
        double rezultat = 0;
        for (int i = nrMIN; i<= nrMAX; i++) {
            rezultat += i;
        }
        return rezultat;
    }
}
