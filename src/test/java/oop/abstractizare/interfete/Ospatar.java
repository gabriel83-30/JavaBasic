package oop.abstractizare.interfete;

public class Ospatar implements ServesteInterface{

    @Override
    public void primesteComanda(int numarComanda) {
        System.out.println("Ospatarul preia comanda cu numarul " + numarComanda);
    }

    @Override
    public void servesteMancarea(String tipMancare, String numeClient) {
        System.out.println("Ospatarul serveste mancarea " +tipMancare + " la clientul " + numeClient);
    }
}
