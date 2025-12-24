package Fundamentos;


public class Wrappers {
    public static void main (String[] args){

        //byte
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 100000L;

        Integer newI = Integer.parseInt("1000");
        System.out.printf("This is a String converted to Integer: %d%n", newI);
        System.out.println("This is a String: 1000");
    }
}
