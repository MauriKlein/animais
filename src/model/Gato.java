package model;

public class Gato extends Animal implements Carnivoro{

    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau - Miau !");
    }

    @Override
    public void comerCarne() {
        System.out.println("Gato - Comendo carne");
    }
}
