package model;

public class AppAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Totó", "Doberman");
        Gato gato = new Gato("Peludo", "Persa");
        Vaca vaca = new Vaca("Mimosa", "Angus");

        cachorro.emitirSom();
        cachorro.comerCarne();

        gato.emitirSom();
        gato.comerCarne();

        vaca.emitirSom();
        vaca.comerCapim();


    }
}
