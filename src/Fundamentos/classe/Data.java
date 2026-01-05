package Fundamentos.classe;

public class Data {

    int dia, mes, ano;

    Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;

    }

    //Desafio, criar método, retornar data formatada
    String formataData(int dia, int mes, int ano) {
        return dia + "/" + mes + "/" + ano;
    }

    void imprimirData() {
        System.out.println(formataData(dia, mes, ano));
    }
}
