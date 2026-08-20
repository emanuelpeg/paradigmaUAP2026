package edu.uap;

public class Main {
    public static void main(String[] args) {
        var unGato = new Gato();
        var unPerro = new Perro();
        var unShow = new ShowRuido();

        unShow.imprimirRuido(unGato);
        unShow.imprimirRuido(unPerro);
    }
}