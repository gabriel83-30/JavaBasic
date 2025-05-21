package oop.oopExample;

import java.security.PublicKey;

public class Persoana {
    // oop --> programare orintata pe obiect(Object-Oriented Programming).
    // Patru principii importante: mostenire, incapsulare, polimorfism si abstarctizare.
    // Moștenirea = in Java este conceptul prin care o clasa (clasa copli) mosteneste o alta clasa(clasa Parinte).
    //   In momentul in care o clasa mosteneste alta clasa, clasa copil are vizibilitate asupra variabilelor/metodelor din clasa parinte.
    //   In Java se poate o singura clasa cu ajutorul cuvantului cheie "extends".
    //   In momentul in care o clasa mosteneste o alta clasa, clasa copli apeleaza constructorul din parinte.
    //   Si constructorul din clasa parinte spre copil se apeleaza cu cuvantul cheie "super".

    // Incapsularea = procesul prin care tinem private anumite informatii in asa fel incat acestea sa nu poata fi moodificate.
    // Ca sa putem face informatiile private vom face variabilele / metodele din " public " in " private ".
    //  Modificator de acces:
    //   public = codul se poate accesa de oriunde si din clasa;-- pt interviu
    //   private  = codul se poate accesa doar din clasa de unde s-a scris codul; --pt interviu
    //   protected =  codul se poate accesa doar din pachetul in care s-a scris codul, dar si de catre subclase;-- pt interviu
    //   default = codul se poate accesa doar din pachetul in care s-a scris codul;
    //   ca sa extragem (modificam) o valoare a unei variabile private ne folosim de metode de get / set(getter si setter);

    // Polimorfism = Conceptul prin care definim mai multe implementari pentru o metoda
    // Este de doua tipuri Static(overloading) si Dinamic(overreading)
    // Polimorfismul dinamic intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    // Polimorfismul static = posibilitatea prin care o metoda are mai multe implementari prin diferentierea tipului sau nr de parametrii

    // Abstractizare = este procesul de reducere a complexitatii prin ascunderea detaliilor de implementare si expunerea doar a functionalitatii
    // SE realizeaza prin clase abstracte si/sau interfete

    // Clasele abstracte se declara folosind cuvantul cheie "abstract"
    // Pot contine atat metode abstracte (fara corp/cod sau implementare) cat si metode concrete( metode obsnuite, cu implementare)
    // NU pot sa fie instantiate( nu poti face un obiect din clasa abstracta)
    // Poate fi utilizata numai ca superclasa pt alte clase care extind clasa abstracta
    // Poate avea variabile si atribute ca si o clasa normala

    // Interfata = este un protocol pe care clasa trebue sa o implementeze ( ofera un raspuns la lipsa mostenirii multiple)
    // O clasa poate mostenii mai multe interfete
    // Intrefata contine doar metode abstracte  * interfata poata sa contina si metode cu implementare dar poate
//    sa aiba doua tipuri de metode(default:public void)
    // Interfetele pot extinde alte interfete
    // Ai cuvantul cheie = 'interface'
    // Putem sa mostenim o interfata cu cuvantul = 'implements'


    // conceptul de mostenire:
    private String nume;
    private String prenume;
    private Integer varsta;


    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este: " + nume);
        System.out.println("Prenumele persoanei este: " + prenume);
        System.out.println("Varsta persoanei este: " + varsta);

    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    // polimorfism dinamic ---> prima implementare a metodei
public void mananca(){
    System.out.println("Persoana mananca cand e foame");
    }

    // homework ---> exemplu de polimorfism dinamic , static;
    //          ----> exemplu de incapsulare
    //          ----> exemplu de mostenire
    //          ----> obiect constructor
}
