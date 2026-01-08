package Fundamentos.classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Notebook", 3500.00);
        Produto produto2 = new Produto("Caneta preta",2.00);

        Produto.desconto = 0.30;

        double precoFinalp1 = produto1.calculaDesconto();
        System.out.printf("Preço final: %.2f %n", precoFinalp1);

        double precoFinalp2 = produto2.calculaDesconto();
        System.out.printf("Preço final: %.2f %n",precoFinalp2);
    }
}
