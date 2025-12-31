package Fundamentos.basico;

public class ConvertionPrimitiveNumberTypes {
    public static void main(String[] args) {
        double a = 1; //automatic convertion

        //float b = 1.0F; //convertion with F
        float b = (float) 1.0; // (Cast) explicit

        int c = 4;
        System.out.println(c);

        byte d = (byte) c;
        System.out.println(d); // (Cast) explicit


    }
}
