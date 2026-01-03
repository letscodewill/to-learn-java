package Fundamentos.classe;

public class Data {

    int dia, mes, ano;

    //Desafio, criar método, retornar data formatada
    String formataData(int dia, int mes, int ano) {
        return dia + "/" + mes + "/" + ano;
    }

    void imprimirData() {
        System.out.println(formataData(dia, mes, ano));
    }
}
