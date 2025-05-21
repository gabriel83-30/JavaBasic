package variabileMetode;

import org.testng.annotations.Test;

import java.util.Locale;

public class Casa { // numele clasei

    // declaram variabile globale
    String culoareCasei = "Alb";
    int numarEtaje = 2;
    double suprafataCasei = 120.50;


// declaram metoda void fara parametrii
    public void afiseazaDetalii() {
        System.out.println("Culoarea casei este " + culoareCasei + ", are " + numarEtaje + " etaje " + "si suprafata casei este de " + suprafataCasei + " metrii patrati.");

        // declaram variabile locale
        String strada = "Principala";
        String zona = "Rezidentiala";
        int numarCasa = 800;
        System.out.println("Casa este pe strada " + strada + ",la numarul " + numarCasa + " in zona " + zona.toUpperCase() + ".");
    }

// declaram metoda void cu parametrii
    public void schimbareCuloare(String nouaCuloare) {
        culoareCasei = nouaCuloare;
        System.out.println("Culoarea casei a fost schimbata in" + nouaCuloare + ".");

    }

//    declaram metoda tip return fara parametrii
    public int getNumarEtaje() {
        return numarEtaje;
    }


//    declaram metoda tip return cu parametrii
    public double calculeazaPret(double pretPerMetruPatrat){
        return suprafataCasei * pretPerMetruPatrat;

    }

    @Test // apelam metodele si variabilele
    public void testCasa(){
        System.out.println("Metoda TEST CASA afisare in consola toate variabilele si metodele: ");

        // Apelam variabilele globale

        System.out.println("Culoarea casei este " + culoareCasei);
        System.out.println("Casa are " + numarEtaje + " etaje.");
        System.out.println("Suprafata casei este " + suprafataCasei);

        // apelam metodele

        afiseazaDetalii();
        schimbareCuloare(" Gri antracit");
        afiseazaDetalii();
        System.out.println("Numar etaje returnat: " + getNumarEtaje());
        System.out.println("Pret estimat al casei: " + calculeazaPret(1250.5) + " EURO");


    }

}





