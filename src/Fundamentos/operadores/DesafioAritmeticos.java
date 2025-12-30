package Fundamentos.operadores;

public class DesafioAritmeticos {
    public static void main(String[] args) {

//        int a = 3 * 4 - 10;
//        int b = (int) Math.pow(a,3);
//        double c = Math.pow(a,3);
//
//        System.out.println(b);
        double calcA = 6 * (3+2);
        double a = Math.pow(calcA,2);
        int b = 3*2;

        double calcB = (1-5)*(2-7);
        double c = Math.pow(calcB,2);
        double d = Math.pow(2,2);

        double e = Math.pow(10,3);

        double f = a / b;
        double g = c / d;

        double h = (f-g);
        double i = Math.pow(h,3);

        double j = i/e;

        System.out.println("O resultado do calculo é: " + j);



    }
}
