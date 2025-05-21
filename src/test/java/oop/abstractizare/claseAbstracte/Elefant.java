package oop.abstractizare.claseAbstracte;

public class Elefant extends Animal{

    @Override
    public void mananca() {
        System.out.println("Elefantul mananca arahide.");
    }

    @Override
    public void infoAnimal() {
        System.out.println("Elefantul nu uita niciodata.");
    }


    public void doarme(){
        super.doarme();
        System.out.println("Elefantul doarme in picioare.");

    }
}
