package model;

public class Cachorro extends Animal implements Carnivoro{

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au - Au !");
    }

    @Override
    public void comerCarne() {
        System.out.println("Cachorro - comendo carne");
    }
}
