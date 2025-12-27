package Fundamentos;

import java.util.Scanner;

public class DesafioDaMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type your first salary: ");
        String value1 = input.next().replace(",", ".");

        System.out.print("Type your second salary: ");
        String value2 = input.next().replace(",", ".");

        System.out.print("Type your third salary: ");
        String value3 = input.next().replace(",", ".");

        double salary1 = Double.parseDouble(value1);
        double salary2 = Double.parseDouble(value2);
        double salary3 = Double.parseDouble(value3);

        double media = (salary1 + salary2 + salary3) / 3;
        System.out.println("The average salary is " + media);
    }
    }
