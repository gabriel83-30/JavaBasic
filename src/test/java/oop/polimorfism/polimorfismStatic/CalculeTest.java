package oop.polimorfism.polimorfismStatic;

import org.testng.annotations.Test;

public class CalculeTest {

    @Test
    public void calculeTest(){

        Calcule adunarePolimorfism = new Calcule();

        System.out.println("Adunarea a doua int este: " + adunarePolimorfism.adunare(3,4));
        System.out.println("Adunarea a doua douable este: " + adunarePolimorfism.adunare(3.15,4.20));
        System.out.println("Adunarea a doua int este: " + adunarePolimorfism.adunare("Buna seara", " 15 mai 2025" ));
    }
}
