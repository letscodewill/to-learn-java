package Fundamentos.classe;

public class DesafioClasse {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro",65.5);
        Pessoa p2 = new Pessoa("Maria",80);

        Comida lasanha = new Comida();
        lasanha.nome = "Lasanha";
        lasanha.peso = 0.350;

        Comida batata = new Comida();
        batata.nome = "Batata Frita";
        batata.peso = 0.200;

        Jantar j1 = new Jantar();
        j1.Jantar(p1,lasanha);

    }
}
