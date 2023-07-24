package wrappers;

public class Main {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        System.out.println(maxInt + " " + minInt);

        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.println(maxLong + minLong); // face suma
        System.out.println(maxLong + " " + minLong ); // concateneaza

        Float numarFloat1 = 3.14f;
        Float numarFloat2 = 4.14f;
        Float numarFloat3 = new Float(3.14f);

        if(numarFloat1.equals(numarFloat3)){
            System.out.println("obiectele au aceeasi valoare");
        } else {
            System.out.println(" NU AU ACEEASI VALOARE");
        }

        if(numarFloat1 == numarFloat3){
            System.out.println("obiectele au aceeasi REFERINTA");
        } else {
            System.out.println(" NU AU ACEEASI REFERINTA");
        }

        System.out.println(numarFloat1.compareTo(numarFloat2)); // 1 e mai mare prima valoare sau -1 daca e mai mica prima valoare. 0 - daca sunt egale

        // AUTOBOXING = conversie implicita de la primitive la obiecte
        // clasele  - prima litera mare
        Double numarDouble1 = 30.58; // Double este clasa. numarDouble1 este o variabila dar devine obiect
        char z = 'z';
        Character character1 = z;
        Character character2 = character1;
        System.out.println(character1 + " " + character2);

        Integer numarInteger = 5; // Integer e o clasa wrapper
        //UNBOXING = conversie de la obiect la primitiva
        int numarInt = numarInteger;
        System.out.println(numarInt);
        double numarDouble = numarInteger;
        System.out.println(numarDouble);
        int numarInt2 = numarDouble1.intValue();
        System.out.println(numarInt2);

        // conversia de la primitiva la obiect
        int numarInt1 = 99990000;
        Long numarLong1 = (long)numarInt1;
        Long numarLong2 = Long.valueOf(numarInt1); // int -> la long (primitiva = conversie implicita) -> la Long (obiect) . NU SE PIERDE PRECIZIE
        System.out.println(numarLong1);

        Float numarFloat4 = (float)numarInt1; // SE pierde precizie
        Float numarFloat5 = Float.valueOf(numarInt1);
        System.out.printf("%.2f \n", numarFloat5);

        // conversie de la sir de caractere (String) la clasa Double
        Double numarDouble2 = Double.valueOf("3.14");
        System.out.println(numarDouble2);

        String numarString ="123";
        Short numarShort = Short.valueOf(numarString);
        System.out.println(numarShort);

        // conversie de la Wrapper la sir de caractere
        String numarDoubleString = numarDouble2.toString();
        System.out.println(numarDoubleString);





    }
}
