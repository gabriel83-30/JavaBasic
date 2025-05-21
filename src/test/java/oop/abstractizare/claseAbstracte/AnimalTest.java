package oop.abstractizare.claseAbstracte;

import org.testng.annotations.Test;

public class AnimalTest {
    @Test
    public void testMethod(){

        System.out.println("====Exemplu====== Animal - Elefant");
        Elefant Chici = new Elefant();
        Chici.mananca();
        Chici.infoAnimal();
        Chici.doarme();

        System.out.println("====Exemplu===== Animal - Aligator");
        Aligator Mimi = new Aligator();
        Mimi.mananca();
        Mimi.setNume("Mimi");
        Mimi.setCuloare("Verde");
        Mimi.setGreutate(98);
        Mimi.infoAnimal();
        Mimi.doarme();

        System.out.println("=====Exemplu===== Animal - Dinozaur");
        Dinozaur Gigi = new Dinozaur();
        Gigi.setNume("Gigi");
        Gigi.setGreutate(760);
        Gigi. setCuloare("Roz");
        Gigi.mananca();
        Gigi.infoAnimal();
        Gigi.doarme();

        // Calsa abstracta nu se poate instantia( adica sa faci un obiect)
        // Animal Animal = new Animal();


    }
}
