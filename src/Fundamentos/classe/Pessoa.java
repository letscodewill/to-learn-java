package Fundamentos.classe;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void PesoAtual(){
        System.out.println("Peso atual: " + this.peso);
    }
}
