package oop.abstractizare.claseAbstracte;

import java.security.PublicKey;

public abstract class Animal {

    private String Culoare;
    private String Nume;
    private int Greutate;

    public abstract void mananca();
    public abstract void infoAnimal();


    public String getCuloare() {
        return Culoare;
    }

    public void setCuloare(String culoare) {
        Culoare = culoare;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public int getGreutate() {
        return Greutate;
    }

    public void setGreutate(int greutate) {
        Greutate = greutate;
    }


    public void doarme(){
        System.out.println("Toate animalele au nevoie de somn. ");
    }
}




