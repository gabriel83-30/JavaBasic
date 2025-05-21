package oop.abstractizare.interfete;

public class Chelner implements ServesteInterface, CurataInterface{


    @Override
    public void curataMasa(int numarMasa) {
        System.out.println("Chelnerul curata masa cu numarul " + numarMasa);
    }

    @Override
    public void spalaVase() {
        System.out.println("Chelnerul spala vasele dupa ce se inchide restaurantul");

    }

    @Override
    public void primesteComanda(int numarComanda) {
        System.out.println("Chelnerul primieste comanda cu numarul " + numarComanda);
    }

    @Override
    public void servesteMancarea(String tipMancare, String numeClient) {
        System.out.println("Chelnerul duce mancarea " + tipMancare + " la clientul  " + numeClient );
    }
}
