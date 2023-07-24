package exsuplimentare.stringclass;

public class ex5 {
    public static void main(String[] args) {
        String string1 = "primul ";
        String string2 = "numar 2 ";
        String string3 = "numar 3 ";
        String string4 = string1 + string2 + string3;
        System.out.println(string4);
        String string5 = string1.concat(string2).concat(string3);
        System.out.println(string5);
    }
}
