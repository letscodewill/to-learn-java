package Fundamentos.controle;

import javax.swing.*;
import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        String opcaoEscolhida = JOptionPane.showInputDialog("Digite o dia da semana desejado");
        opcaoEscolhida = opcaoEscolhida.toLowerCase();

        if (opcaoEscolhida.equals("domingo")) {
            System.out.println("Domingo é o primeiro dia da semana || Dia 1");
        } else if (opcaoEscolhida.equals("segunda")) {
            System.out.println("Segunda é o segundo dia da semana || Dia 2");
        } else if (opcaoEscolhida.equals("terça") || opcaoEscolhida.equals("terca")) {
            System.out.println("Terça é o terceiro dia da semana || Dia 3");
        } else if (opcaoEscolhida.equals("quarta")) {
            System.out.println("Quarta é o quarto dia da semana || Dia 4");
        } else if (opcaoEscolhida.equals("quinta")) {
            System.out.println("Quinta é o quinto dia da semana || Dia 5");
        } else if (opcaoEscolhida.equals("sexta")) {
            System.out.println("Sexta é o sexto dia da semana || Dia 6");
        }else if (opcaoEscolhida.equals("sábado") || opcaoEscolhida.equals("sabado")) {
            System.out.println("Sábado é o sétimo dia da semana || Dia 7");
        }else{
            System.out.println("Dia inválido");
        }

    }
}
