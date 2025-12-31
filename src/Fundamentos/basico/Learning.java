package Fundamentos.basico;

public class Learning {
    public static void main(String[] args){
        String fruit = "Apple";

        if(fruit.equals("Apple")){
            System.out.println("I Love Apples");
        } else {
            System.out.println("That is not an apple");
        }

        String name = "Willian";
        String secondName = "Santos";
        Integer yearsOld = 31;

        String phrase = String.format("My name is %s %s and I have %d years old.", name, secondName, yearsOld);

        System.out.println(phrase);
    }
}
