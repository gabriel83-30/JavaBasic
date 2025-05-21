package oop.abstractizare.interfete;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RestaurantTest {
    @Test
    public void activitateRestaurant(){
        Bucatar Ion = new Bucatar();
        Ion.pregatesteMancarea("Lasagne");

        Chelner Petre = new Chelner();
        Petre.primesteComanda(3);
        Petre.servesteMancarea("Lasagne", "Liana");
        Petre.curataMasa(14);
        Petre.spalaVase();

        Ospatar George = new Ospatar();
        George.primesteComanda(5);
        George.servesteMancarea("Lasagne", "Maria");

        AsistentBucatar Toto = new AsistentBucatar();
        Toto.curataMasa(8);
        Toto.spalaVase();

    }
}
