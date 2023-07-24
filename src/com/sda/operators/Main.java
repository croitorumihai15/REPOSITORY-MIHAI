package com.sda.operators;

public class Main {
    public static void main(String[] args) {
        //1. operatori unari : operatorul + numele variabilei /valoare
        System.out.println(+7);
        System.out.println(-7);

        int negativenumber = -2;
        System.out.println(negativenumber);
        int positivenumber = 2;
        System.out.println(-positivenumber);

        boolean javaisfun = false; //!false = true
        System.out.println(!javaisfun);

        int number = 6;
        //pre-incrementare
        System.out.println("pre-incrementare " + ++number);
        //pre-decrementare
        System.out.println(--number);

        //post - incrementare
        System.out.println("post incrementare " + number++);
        System.out.println("post incrementare " + number);

        //post - decrementare
        System.out.println(number--);
        System.out.println(number);

        //2. operatori binari (2 operatori)
        // artimetici
        System.out.println(1+2);
        System.out.println(1+2-3);
        System.out.println(1+2*2/4+10);
        System.out.println(12%5);
        // numar par : numar%2 = 0
        System.out.println((1+2*2/4+10)%2);

        //operatori de atribuire
        int num = 10;
        //num = num +1;
        num += 1; // folosind caracterul de atribuire
        System.out.println(num);
        num -= 1;
        System.out.println(num);
        num *= 2;
        System.out.println(num);
        num /= 5;
        System.out.println(num);
        num %= 2;
        System.out.println(num);

        //operatori de comparatie
        double temperature = 25.7;
        int stdtemp = 22;
        boolean ishotoutside = temperature > stdtemp;
        System.out.println(ishotoutside);

        char chA = 'A';
        boolean isgreaterthan60 = chA < 60;
        System.out.println(isgreaterthan60);

        int number100 = 100;
        boolean isequalto100 = number100 == 100;
        System.out.println(isequalto100);

        temperature = 27;
        boolean isnotequalto = temperature != 0;
        System.out.println(isnotequalto);

        //operatori logici
        // && si ; || sau ; ! negatie
        int number1 = 12;
        boolean isgreaterthan100andlowerthan500 = number1 >= 100 || number1 <= 500;
        System.out.println(isgreaterthan100andlowerthan500);

        //operatori pe biti
        // & | ^

        System.out.println(10 & 12);
        // binar in baza 2
        // 10 / 2 = 5 rest 0
        // => 10 = 1010

        //      2^3    2^2     2^1   2^0
        //       8      4        2     1
        //       1      0        1     0  ->  10
        //    1*2^3 +  0*2^2   + 1*2^1 + 2

        // 12 = 1100

        // 1010
        // 1100
        // 1000 = 8 in baza 10

        System.out.println(10 | 12);
        System.out.println(~10);

        int number2 = 2;
        //2 = 0010
        System.out.println(number2 <<2);
        // 0010 - 001000 = 1000 = 8


        System.out.println(number2 >> 2);
        // 0010 - 001000 = 0000

        //OPERATOR TERNAR
        // intrerupator bec
        boolean intrerupator = true;
        char esteaprins = intrerupator ? 'a' : 'b';
        System.out.println(esteaprins);

        double temperature2 = 25.5;
        String weather = (temperature2 >= 20) ? "afara este cald" : "afara este frig";
        System.out.println(weather);












    }
}
