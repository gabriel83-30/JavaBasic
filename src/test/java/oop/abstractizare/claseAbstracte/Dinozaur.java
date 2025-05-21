package oop.abstractizare.claseAbstracte;

public class Dinozaur extends Animal {
    @Override
    public void mananca() {
        System.out.println("DINOZAURUL cu numele de: " + getNume() + " mananca carne .");
    }

    @Override
    public void infoAnimal() {
        System.out.println("DINOZAURUL cu numele de: " + getNume() + " de culoarea " + getCuloare() + " cu greutatea " + getGreutate());
    }
}
