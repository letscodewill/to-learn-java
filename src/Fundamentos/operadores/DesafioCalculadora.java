package Fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        float num1, num2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Type one number: ");
        num1 = Float.parseFloat(entrada.nextLine());
        System.out.println("Type a second number: ");
        num2 = Float.parseFloat(entrada.nextLine());

        String symbols;

        System.out.println("Type your operation symbol: ");
        symbols = entrada.next();

        double op = "+".equals(symbols) ? num1 + num2 : 0;
         op = "-".equals(symbols) ? num1 - num2 : op;
         op = "/".equals(symbols) ? num1 / num2 : op;
         op = "*".equals(symbols) ? num1 * num2 : op;
         op = "%".equals(symbols) ? num1 % num2 : op;
        System.out.println("Calculo de " + num1 + " " + symbols + " " + num2 + " = " + op);

        entrada.close();


    }
}
