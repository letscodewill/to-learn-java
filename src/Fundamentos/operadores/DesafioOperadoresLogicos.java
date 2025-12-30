package Fundamentos.operadores;

public class DesafioOperadoresLogicos {
    public static void main(String[] args) {
        //Trabalho na terça (V ou F)
        //Trabalho na quinta(V ou F)

        //Se os 2 é 50
        //Se 1 é 32

        //Tomar sorvete nos dois casos
        //Se nada deu certo, ficar em casa

        boolean trabalhoTerca = true;
        boolean trabalhoQuinta = true;

        boolean comprouTv50 = trabalhoTerca && trabalhoQuinta;
        boolean comprouTv32 = trabalhoTerca ^ trabalhoQuinta;
        boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou a de 50: " +comprouTv50);
        System.out.println("Comprou a de 32: " +comprouTv32);
        System.out.println("Comprou sorvete: " +comprouSorvete);
        System.out.println("Ficou mais saldável: " +maisSaudavel);
    }
}
