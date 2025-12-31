package Fundamentos.controle;

import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a média: ");
        double media = entrada.nextDouble();

        while (media > 10){
            System.out.println("Informe uma média correta: ");
            media = entrada.nextDouble();
        }

        if(media >= 7.0){
            System.out.println("Aluno aprovado");
            System.out.println("Parabéns");
        } else if (media >= 6.0) {
            System.out.println("Aluno de recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }

        entrada.close();
    }
}
