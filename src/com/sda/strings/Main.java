package com.sda.strings;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = new String();
        System.out.println(str2);

        // Utilizarea unui array de caractere
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(chars);
        System.out.println(str3);

        // Utilizarea unui array de octeți și un set de caractere
        byte[] bytes = {72, 101, 108, 108, 111};
        String str4 = new String(bytes);
        System.out.println(str4);

        // Utilizarea unui array de caractere și specificarea unui interval din acesta
        char[] chars1 = {'H', 'e', 'l', 'l', 'o'};
        String str5 = new String(chars1, 0, chars1.length); // Creează șirul “Hello"
        System.out.println(str5);

        // Utilizarea metodei `format()`
        int num = 42;
        double num2 = 3.14;
        String str6 = String.format("Numărul este: %d, %.2f", num, num2);
        System.out.println(str6);

        // Utilizarea concatenării șirurilor
        String str7 = "Hello" + " " + "World";
        System.out.println(str7);

        //IMUTABILITATE - sirurile de caractere nu se modifica / ci doar referintele
        String abc1 = "abc";
        String abc2 = "abc";
        String abc3 = new String("abc");
        String abc4 = abc1;

        String ab = "ab";
        String c = "c";
        abc4 = ab + c;

        if(abc1 == abc4){
            System.out.println("Referinte egale");
        }
        else {
            System.out.println("refereinte diferite");
        }

        if(abc1.equals(abc4)){
            System.out.println("siruri egale");
        }
        else{
            System.out.println("siruri diferite");
        }

        //comparare -compareTo
        String nume1 = "Alexandra";
        String nume2 = "Gigel";

        System.out.println(nume1.compareTo(nume2));
        char a = 'A' , g = 'G' ;
        System.out.println((byte)a + " " + (byte)g);

        // metode ale clasei String
        String exemplu = "Exemplu";
        int lungime = exemplu.length(); // 8
        int index = exemplu.indexOf("e"); // 2
        char caracter = exemplu.charAt(index); // e
        String subsir = exemplu.substring(index); // emplu
        String subsir2 = exemplu.substring(index, 5); //emp
        String subsir3 = exemplu.substring(0,subsir2.length()); // Exe
        String mare = exemplu.toUpperCase(); // toate literele se fac mari
        String mic = exemplu.toLowerCase(); // toate literele se fac mici
        String concatenat = exemplu.concat(" siruri de caractere"); // concateneaza



        System.out.println(concatenat);
        System.out.println(mare);
        System.out.println(subsir2);
        System.out.println(index);
        System.out.println(lungime);
        System.out.println(caracter);
        System.out.println(index + " " + caracter);
        System.out.println(subsir);
        System.out.println(subsir3); //Exe

        //replace , starts, ends, split
        String replace = exemplu.replace('e' , 'a'); // schimba e-urile cu a
        boolean incepeCuEx = exemplu.startsWith("ex"); // false - e ul e scris cu litera mare "E"
        boolean terminaCuLu = exemplu.endsWith("lu"); // true
        String[] cuvinte = concatenat.split(" ");

        for(int i = 0; i < cuvinte.length; i++) {
            System.out.println(cuvinte[i]);
        }

        System.out.println(replace);
        System.out.println(incepeCuEx);
        System.out.println(terminaCuLu);
        System.out.println(concatenat);






    }


}
