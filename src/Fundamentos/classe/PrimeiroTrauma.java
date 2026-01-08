package Fundamentos.classe;

public class PrimeiroTrauma {

    int a = 3; // Não pode mexer nessa linha
    static int b = 4; //2 solução deixar estático

    public static void main(String[] args) {
        PrimeiroTrauma p =  new PrimeiroTrauma(); // 1 solução
        System.out.println(p.a);
        System.out.println(b);
    }
}
