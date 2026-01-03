package Fundamentos.classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 3;
        d1.mes = 1;
        d1.ano = 2026;

        Data d2 = new Data();
        d2.dia = 6;
        d2.mes = 6;
        d2.ano = 2021;

        String dataDeHoje = d1.formataData(d1.dia, d1.mes, d1.ano);
        System.out.printf("Data de hoje %s%n", dataDeHoje);
        d1.imprimirData();

        String aniversarioNena = d2.formataData(d2.dia, d2.mes, d2.ano);
        System.out.printf("Aniversário da Nena %s%n", aniversarioNena);
    }
}
