package Fundamentos;
//import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        double farenheit = 86;
        final double FATOR =  5 / 9.0;
        final int AJUSTE = 32;
        double celsius = (farenheit - AJUSTE) * FATOR;

        System.out.println("O resultado é: " + celsius);
    }
}
