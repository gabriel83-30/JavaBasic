package structuriRepetitive;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//                                              Homework
//
//    1. Faceti o metoda care  sa gaseasca un cuvant dintr-o lista si cand il gaseste sa il printeze in consola
//    Lista de fructe, masini, etc: sa construim o lista
//    2. Faceti o metoda care  sa gaseasca un cuvant dintr-un hash map si cand il gaseste sa il printeze in consola
//    Hash map de obiecte, animale, etc: sa construim un hashmap

//    Faceti alte exemple cu hashmap-uri si liste

// PROBLEMA 1.

public class Homework {

    @Test
    public void testHomework() {

        /// Problema 1.

        System.out.println("Rezolvare Problema 1: ");
//        fructeLista(); // apelam metoda

        List<String> fructe = Arrays.asList("Mere", "Pere", "Caise", "Piersici");
        // - declaram o listă de fructe (List) care va conține elemente de tip String.
        // - "Arrays.asList" este o metodă statică din clasa Arrays, care primește elemente  le transformă într-o listă fixă care conține exact acele elemente.
        // - lista creata "Arrays.asList"nu se mai poațe adăuga sau elimina elemente.
        gasesteCuvantul(fructe, "Mere");
        gasesteCuvantul(fructe, "Kiwi");

        boolean rezultatUnu = cautaCuvantul(fructe, "Caise");
        boolean rezultatDoi = cautaCuvantul(fructe, "Mango");
        System.out.println("Caisele se regasesc in lista - " + rezultatUnu);
        System.out.println("Mango se regaseste in lista - " + rezultatDoi);


        /// Problema 2.
        System.out.println("___________________________________________");
        System.out.println("Rezolvare Problema 2: ");

        HashMap<String, String> categoriiObiecte = new HashMap<>();
        afisareHashMapObiecte(categoriiObiecte, "Hotel");
        afisareHashMapObiecte(categoriiObiecte, "Studio");

        boolean rezultatTrei = cautaCuvantulHashMap(categoriiObiecte, "Garsoniera");
        boolean rezultatPatru = cautaCuvantulHashMap(categoriiObiecte, "Pensiune");
        System.out.println("Garsoniera se afla in HashMap: " + rezultatTrei);
        System.out.println("Pensiunea se afla in HashMap: " + rezultatPatru);
    }

    /// Varianta cu "if"

    public void gasesteCuvantul(List<String> fructeLista, String cuvant) {   // - declaram o metoda cu parametrii- o listă de elemente si String "cuvant": cuvântul pe care vrem să-l cauțam în acea listă.
        if (fructeLista.contains(cuvant)) {     // Verifică dacă lista conține cuvântul dat.
            System.out.println("Cuvantul gasit este: " + cuvant); // Returnează true dacă îl găsește, altfel false.
        } else {
            System.out.println("Cuvantul " + cuvant + " nu este in lista. "); //
        }

    }


    /// Varianta cu "boolean"
    public boolean cautaCuvantul(List<String> fructe, String cuvant) { /// declaram o metoda cu parametrii si return
        return fructe.contains(cuvant);
    }

    public void fructeLista() { // declaram metoda

        List<String> fructeleDinLista = new ArrayList<>(); // cream un obiect ArrayList

        // in clasa ArrayList pt a adauga elemente folosim metoda "add()"
//        fructeleDinLista.add("Mere");
//        fructeleDinLista.add("Pere");
//        fructeleDinLista.add("Caise");
//        fructeleDinLista.add("Piersici");
//        fructeleDinLista.add("Prune");
//        fructeleDinLista.add("Struguri");
//        fructeleDinLista.add(0, "Banane"); // - inseram un element nou specificand pozitia cu ajutorul indexului.
//        fructeleDinLista.add(2, "Kiwi"); // - inseram un element nou specificand pozitia cu ajutorul indexului.
//        System.out.println("Printam toate fructele din ArrayList: " + fructeleDinLista);
//        System.out.println("Printam doar un element din ArrayList si anume: " + fructeleDinLista.get(0)); // - folosim metoda "get()" cu referire la index
//        System.out.println("Printam doar un element din ArrayList si anume: " + fructeleDinLista.get(5));


    }


    /// PROBLEMA 2.

//    2. Faceti o metoda care  sa gaseasca un cuvant dintr-un hash map si cand il gaseste sa il printeze in consola
//    Hash map de obiecte, animale, etc: sa construim un hashmap.

    public void afisareHashMapObiecte(HashMap<String, String> categoriiObiecte, String cuvantul) {
        // - declaram metoda noua cu parametrii, un HashMap care permite asocieri între o cheie
        // și o valoare (în acest caz, cuvântul este cheia, iar descrierea este valoarea).
        // _ al doilea parametru al metodei este cuvântul pe care dorim să-l căutăm în HashMap si este de tip String.
        // - cream obiectul HashMap - "categoriiObiecte" folosind metoda "put" care va stoca cuvinte și descrierea lor.

        categoriiObiecte.put("Garsoniera", "O camera, o bucatarie si o baie.");
        categoriiObiecte.put("Apartament", "Doua Camere, o bucatarie, un balcon si o baie.");
        categoriiObiecte.put("Casa", "Trei camere, o bucatarie, 2 balcoane, 2 bai si curte.");
        categoriiObiecte.put("Hotel", "Zece Camere, zece bai, holuri mari, receptie si curte cu locuri de parcare.");

        /// Varianta cu "if"
        if (categoriiObiecte.containsKey(cuvantul)) {
            System.out.println("Cuvantul gasit :" + cuvantul); // - dc cuvantul exista in HashMap
            System.out.println("Descriere : " + categoriiObiecte.get(cuvantul));
        } else {
            System.out.println("Cuvantul " + cuvantul + " nu a fost gasit in HashMap."); // dc nu exista in HashMap
        }


    }
        /// Varianta cu "boolean"
    public boolean cautaCuvantulHashMap(HashMap<String, String> categoriiObiecte, String cuvant) {  /// declaram o metoda cu parametrii si return
        return categoriiObiecte.containsKey(cuvant);
    }


}




