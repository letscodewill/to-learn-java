package Fundamentos.classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Notebook", 3500.00, 0.10);

        Produto produto2 = new Produto("Caneta preta",2.00, 0.02);

        double precoFinalp1 = produto1.calculaDesconto(0.80);
        System.out.printf("Preço final: %.2f %n", precoFinalp1);

        double precoFinalp2 = produto2.calculaDesconto();
        System.out.printf("Preço final: %.2f %n",precoFinalp2);
    }
}
