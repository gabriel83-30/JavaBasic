package oop.oopExample;

public class Angajat extends Persoana{

    public String compania;
    public Double salariu;
    public Integer experienta;

public Angajat(String nume, String prenume, Integer varsta, String compania, Double salariu, Integer experienta) {
        super(nume, prenume, varsta);
        this.compania = compania;
        this.salariu = salariu;
        this.experienta = experienta;
    }

    public void infoAngajat(){
        System.out.println("Angajatul " + getNume() + " lucreaza la compania " + compania);
        System.out.println("Angajatul " + getPrenume() + " are salariu de  " + salariu + " EURO.");
        System.out.println("Varsta Angajatului " + getNume() + " " + getPrenume() + " este " + getVarsta() +
                " si are o experienta " + experienta + " ani.");

    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public void setSalariu(Double salariu) {
        this.salariu = salariu;
    }

    public void setExperienta(Integer experienta) {
        this.experienta = experienta;
    }

    // polimorfism dinamic ---> A doua implementare a metodei
    public void mananca(){
        System.out.println("Angajatul mananca numai in pauza de masa.");
    }

    // polimorfism static
    public void marire(String grad){
        System.out.println("Angajatul primeste o marire la gradul de: " + grad );
    }

    public void marire(double procent){
        System.out.println("Angajatul primeste o marire de: " + procent +   " %." );
    }

    public void marire(String prima, int suma){
        System.out.println("Angajatul primeste o prima de: " + prima + " in valoare de " + suma + " EURO.");
    }

}
