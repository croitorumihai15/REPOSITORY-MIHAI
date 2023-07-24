package enums;

public class Main {
    public static void main(String[] args) {


        ZiSaptamana zi = ZiSaptamana.JOI;

        String ziString = zi.toString();
        System.out.println(ziString);

        // switch
        switch (zi) {
            case LUNI:
                System.out.println("azi este luni");
                break;
            case MARTI:
                System.out.println("azi este marti");
                break;
            case MIERCURI:
                System.out.println("azi este miercuri");
                break;
            case JOI:
                System.out.println("azi este joi");
                break;
            case VINERI:
                System.out.println("azi este vineri");
                break;
            case SAMBATA:
                System.out.println("azi este sambata");
                break;
            case DUMINICA:
                System.out.println("azi este duminica");
                break;

        }


    }
}
