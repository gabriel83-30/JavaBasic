package oop.abstractizare.interfete;

public class AsistentBucatar implements CurataInterface{

    @Override
    public void curataMasa(int numarMasa) {
        System.out.println("Asistentul vine si debaraseaza masa " + numarMasa);
    }

    @Override
    public void spalaVase() {
        System.out.println("Asistentul trebuie sa spele vasele ");
    }
}
