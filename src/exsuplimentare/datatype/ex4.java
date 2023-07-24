package exsuplimentare.datatype;

public class ex4 {
    public static void main(String[] args) {
        int intVar1 = 10;
        int intVar2 = 11;

        short shortSum = (short) (intVar1 + intVar2);
        System.out.println(shortSum);
        System.out.println(shortSum++);

        byte byteSum = (byte) (intVar1 + intVar2);
        System.out.println(byteSum);
        System.out.println(++byteSum);


        int intel1 = 2;
        short short1 = 3;
        int short2 = intel1 + short1;
        System.out.println(short2);


    }
}
