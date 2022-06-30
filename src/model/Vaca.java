package model;

public class Vaca extends Animal implements Herbivoro{

    public Vaca(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void emitirSom() {
        System.out.println("Muuuuu - Muuuuuu !");
    }

    @Override
    public void comerCapim() {
        System.out.println("Vaca - Comendo capim");
    }
}
