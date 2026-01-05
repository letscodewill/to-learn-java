package Fundamentos.classe;

public class Produto {

    String nome;
    double preco, desconto;

    Produto(String nomeInicial, double precoInicial, double descontoInicial){
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }
    double calculaDesconto(double descontoDoGerente){
        return preco * (1 - (desconto + descontoDoGerente));
    }
    double calculaDesconto(){
        return preco * (1 - desconto );
    }
}
