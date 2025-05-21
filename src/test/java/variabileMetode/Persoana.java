package variabileMetode;

import org.testng.annotations.Test;

public class Persoana {
//  O clasa in Java este o structura ce defineste atat atributele/variabile cat si metodele unui obiect
//  Tipurile de date in Java sunt de 2 feluri:(pt interviu)
//     Tipuri de date primitive ---> stocheaza direct valoarea >> sunt 8 tipuri de date
//     - byte( 8 biţi)
//     - short( 16 biţi)
//     - int( 32 biţi)
//     - long(64 bitţi)
//     - double(numere zecimale cu virgula)
//     - float(numere zecimale, dar precizie mai mica)
//     - char(caractere individuale)
//     - boolean(valori logica true/false)
//     Tipuri de date de referinta(sau ne-primitive), stocheaza doar referinta catre un obiect)
//    - clasa/interfata/array

//  Tipuri de variabile in Java:
//    1. Variabile de instanta(variabile globale)
//    2. Variabile locale(variabile din interiorul metodelor)

//  Metodele: o metoda este un bloc de cod care indeplineste o functie specifica(actiune/comportament)
//    Categorii:
//      1. metode fara return(sau void) --> ruleaza logica din interior si nu returneaza nimic
//          modificator de acces(public/ private/ protected void numeleMetodei (cu parametrii sau fara parametrii) {
//          logica/corpul metodei
//          }
//     2. metoda cu return ---> sa returneze un rezultat
//          modificator de acces(public/ private/ protected) tipulReturnat(int/String) numeleMetodei(cu/fara parametrii) {
//          logica/corpul metodei
//          return valoarea de tipulReturnat
//    }

    //    Declaram variabile de instanta(sau globale)
    String numelePersoanei = "Popescu";
    String prenumelePersoanei = "Andrei";
    char sexulPersoanei = 'M';
    int anDeNastere = 2000;


    // metode de test
    @Test // adnotare
    public void afisareVariabileGlobaleTest() {
        System.out.println("Persoana are numele: " + numelePersoanei);
        System.out.println("Persoana are prenumele: " + prenumelePersoanei);
        System.out.println("Persoana e de sexul: " + sexulPersoanei);


    }

    @Test
    public void afisareDetaliiPersoana() {

//        declaram niste variabile locale
        double inaltimePersoanei = 1.87;
        int varstaPersoanei = 41;
        String adresaPersoanei = "Strada Ana Ipatescu nr. 126";

        System.out.println("Detalii persoanei sunt: ");
        System.out.println("Persoana are numele: " + numelePersoanei);
        System.out.println("Persoana are prenumele: " + prenumelePersoanei);
        System.out.println("Persoana e de sexul: " + sexulPersoanei);
        System.out.println("Inaltimea persoanei este: " + inaltimePersoanei);
        System.out.println("Varsta persoanei: " + varstaPersoanei);
        System.out.println("Adresa persoanei: " + adresaPersoanei);

    }

    @Test
    public void afisareDetaliiProfesionale() {
        System.out.println("Varsta actuala a persoanei este: " + calculeazaVarsta(2025));
        System.out.println("Verificam daca persoana este adulta? " + esteAdult(16));
        System.out.println("Verificam daca persoana este adulta? " + esteAdult(calculeazaVarsta(2025)));

    }

    public int calculeazaVarsta(int anulActual) {
        return anulActual - anDeNastere;

    }

    public boolean esteAdult(int varsta) {
        return varsta >= 18;

    }


}





