package Fundamentos.classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.nome = "Notebook";
        produto1.preco = 3500.00;
        produto1.desconto = 0.10;

        Produto produto2 = new Produto();
        produto2.nome = "Caneta preta";
        produto2.preco = 2.00;
        produto2.desconto = 0.02;

        double precoFinalp1 = produto1.calculaDesconto(0.80);
        System.out.printf("Preço final: %.2f %n", precoFinalp1);

        double precoFinalp2 = produto2.calculaDesconto();
        System.out.printf("Preço final: %.2f %n",precoFinalp2);
    }
}
