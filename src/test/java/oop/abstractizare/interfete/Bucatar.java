package oop.abstractizare.interfete;

public class Bucatar implements GatesteInterface{

    @Override
    public void pregatesteMancarea(String tipDeMancare) {
        System.out.println("Bucatarul pregateste mancarea " + tipDeMancare);
    }
}
