package oop.abstractizare.claseAbstracte;

public class Aligator extends Animal{
    @Override
    public void mananca() {
        System.out.println("Aligatorul mananca carne.");
    }

    @Override
    public void infoAnimal() {
        System.out.println("Aligatorul de culoarea " + getCuloare() + " se numeste " + getNume() + " are greutatea " + getGreutate() + " kg");
    }
}
