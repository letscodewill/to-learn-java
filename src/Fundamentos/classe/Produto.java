package Fundamentos.classe;

public class Produto {

    String nome;
    double preco, desconto;

    double calculaDesconto(double descontoDoGerente){
        return preco * (1 - (desconto + descontoDoGerente));
    }
    double calculaDesconto(){
        return preco * (1 - desconto );
    }
}
