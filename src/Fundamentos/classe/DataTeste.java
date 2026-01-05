package Fundamentos.classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();

        Data d2 = new Data();
        d2.dia = 6;
        d2.mes = 6;
        d2.ano = 2021;

        String dataDeHoje = d1.formataData(d1.dia, d1.mes, d1.ano);
        System.out.printf("Data de hoje %s%n", dataDeHoje);


        String aniversarioNena = d2.formataData(d2.dia, d2.mes, d2.ano);
        System.out.printf("Aniversário da Nena %s%n", aniversarioNena);
    }
}
