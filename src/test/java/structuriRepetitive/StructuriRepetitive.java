package structuriRepetitive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StructuriRepetitive {

    private static final Logger log = LoggerFactory.getLogger(StructuriRepetitive.class);

    @Test

    public void testMethod() {

//        In Java un array(multime) este o structura de date care stocheaza o colectie de elemente de acelasi tip, fie primitive ,fie obiective
//        - Dimensiunea este fixa, odata ce este creata multimea, dimensiunea nu se poate schimba
//        - Elemente trebuie sa fie de acelasi tip si accesul la elemente se face prin indexul acestora.

        //apelam metoda colegiDeCursArray
        colegiDeCursArray();
        colegiDeCursLista();
        afisareHashMap();
        afisareHashMap2();

    }

    public void colegiDeCursArray() {

        //   - Cream o multime(array) de Stringuri

        String[] colegi = new String[7];
        colegi[0] = "Marius";
        colegi[1] = "Eugen";
        colegi[2] = "Gigi";
        colegi[3] = "Hilda";
        colegi[4] = "Gabi";
        colegi[5] = "Sanziana";
        colegi[6] = "Razvan";


        System.out.println("Exemplu multimi");

        // "For" este o structura de control utilizata pt a itera o secventa de istructiuni sau pt a parcurge un anumit interval de valori
        // Structura
        //for(initializare;conditie;incrementare/decrementare) {
        //bloc de cod care va fi executat repetat
        //}

        for (int index = 0; index < colegi.length; index++) {

            System.out.println("Numele colegului de la numarul: " + index + " este " + colegi[index]);
//            System.out.println(colegi[3]);
//            System.out.println(colegi);
//            for (String i : colegi) {
//                System.out.println(i);

            }

        }



    public void colegiDeCursLista() {

        // Listele sunt o colectie ordonata de acelasi tip
        //  - Elementele sunt stocate in ordinea in care sunt adaugate
        //  - Accesarea se face tot prin index
        //  - Elementele unei liste pot fi parcurse folosind bucle sau iteratori
        //  - In liste sunt permise elemente duplicate
        //  - In Java sunt mai multe clase care implementeaza listele, cele mai comune folosite sunt ArrayList si LinkedList

        // Exemplu de lista

        List<String> colegiLista = new ArrayList<>();
        colegiLista.add("Maria");
        colegiLista.add("Calin");
        colegiLista.add("Petronela");
        colegiLista.add("Gabriel");
        colegiLista.add("Adrian");
        colegiLista.add("Demetra");

        // "while" este o structura de control utilizata pt. a executa repetat un bloc de cod atat timp cat o anumita conditie este adevarata
        // In timp ce structura " For" este utilizata pentru a itera printr-o secvanta de instructiuni un numar cunoscut de iteratii
        //Structura "while" este folosita atunci cand numarul de iteratii nu este cunoscut in avans dar se stie doar conditia

        // Sintaxa
        // Initializare index
        // While(conditie) {
        // bloc de cod (care va fi executat atat timp cat conditia e adevarata)
        // }

        System.out.println("Exemplu lista");

        int index = 0;
        while (index < colegiLista.size()) {

            System.out.println("Numele colegului de la numarul: " + index + " este " + colegiLista.get(index));
            index++;

        }

    }

    public void afisareHashMap() {

        //HashMap ofera o implementare a unei colectii de tip pereche(cheie-valoare)
        //  - Intr-un hashmap cheile sunt unice, nu pot exista duplicate, fiecare cheie poate fi asociata cu cel mult o valoare


        HashMap<String, String> categoriiObiecte = new HashMap<>();
        categoriiObiecte.put("fructe", "mar");
        categoriiObiecte.put("animale", "urs");
        categoriiObiecte.put("flori", "liliac");

        System.out.println("Exemplu Hashmap");

        // "For-each" este o structura de control cunoscuta si sub denumirea de enhanced for loop
        //      - Se utilizeza pentru a itera o colectie fara sa fie nevoie de un iterator explicit sau sa se lucreze cu indici
        // sintaxa:
        // for-foreach(tip element numeElement: colectia) {
        // bloc de cod ( care o sa fie executat pt fiecare element din colectie)
        // }

        for (String key : categoriiObiecte.keySet()) {

            System.out.println("Categoria este " + key + " valoarea este " + categoriiObiecte.get(key));
        }

    }

    public void afisareHashMap2() {

        System.out.println("Exemplu Hashmap2");
        HashMap<String, List<String>> tariOrase = new HashMap<>();

        // Adaugam trei seturi de liste care le vom folosi in Hashmap

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Maria");
        oraseRomania.add("Calin");
        oraseRomania.add("Petronela");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Valancia");
        oraseSpania.add("Madrid");
        oraseSpania.add("Barcelona");

        List<String> oraseUSA = new ArrayList<>();
        oraseUSA.add("New York");
        oraseUSA.add("Chicago");
        oraseUSA.add("Las Vagas");

        // Adaugam valori in hashmap

        tariOrase.put("Romania", oraseRomania);
        tariOrase.put("Spania", oraseSpania);
        tariOrase.put("USA", oraseUSA);

        for (String key : tariOrase.keySet()) {

            System.out.println("Tara este " + key + " orasele sunt " + tariOrase.get(key));
        }

    }

    // Homework

//    1. Faceti o metoda care  sa gaseasca un cuvant dintr-o lista si cand il gaseste sa il printeze in consola
//    Lista de fructe, masini, etc: sa construim o lista
//    2. Faceti o metoda care  sa gaseasca un cuvant dintr-un hash map si cand il gaseste sa il printeze in consola
//    Hash map de obiecte, animale, etc: sa construim un hashmap

//    Faceti alte exemple cu hashmap-uri si liste


}


