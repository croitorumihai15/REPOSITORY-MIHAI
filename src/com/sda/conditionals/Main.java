package com.sda.conditionals;

public class Main {
    public static void main(String[] args) {
        double temperatura = 10;
        if (temperatura >= 22) { //false
            System.out.println("afara e cald");
        }
        else if(temperatura >= 14){ // stim deja ca temp e < 22
            System.out.println("afara e potrivit");
        }
        else {
            System.out.println("nu ies");
        }

        //SWITCH

        //switch (temperatura) {
           // case 22:
              //  System.out.println("afara e cald");
          //  case 0:
              //  System.out.println("afare e FRIG");

        int zi = 1;
        switch (zi) {
            case 1:
                System.out.println("luni");
                break;
            case 2:
                System.out.println("marti");
                break;
            case 3:
                System.out.println("miercuri");
                break;
            default:
                System.out.println("zi invalida");

                // exemple pentru if
                // daca pica o fata a unui zar care este prim , afiseaza ceva
                // daca pica par afiseaza ceva


        }





    }
}
