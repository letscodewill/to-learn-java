package Fundamentos.controle;

public class Switch {
    public static void main(String[] args) {
        String faixa = " ";
        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
                break;
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
                break;
            default:
                System.out.println("Não sei nada ainda.. ");
        }
    }
}
