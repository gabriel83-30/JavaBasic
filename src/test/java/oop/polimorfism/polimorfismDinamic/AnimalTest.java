package oop.polimorfism.polimorfismDinamic;

import org.testng.annotations.Test;

public class AnimalTest {

    @Test
    public void suneteAnimale(){
        Caine Azorel = new Caine();
        Azorel.scoateSunet();

        Pisica Toulose = new Pisica();
        Toulose.scoateSunet();

        Arici Tony = new Arici();
        Tony.scoateSunet();

        Animal Rex = new Animal();
        Rex.scoateSunet();
    }
}
