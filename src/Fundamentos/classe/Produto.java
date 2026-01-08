package Fundamentos.classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }
    double calculaDesconto(){
        System.out.printf("Desconto: %.2f%n", preco - (preco * (1 - desconto )));
        return preco * (1 - desconto );
    }
}
