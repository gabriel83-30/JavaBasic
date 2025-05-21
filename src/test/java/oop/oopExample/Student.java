package oop.oopExample;

import javax.swing.plaf.PanelUI;

public class Student extends Persoana{

    private String facultate;
    private String cursuri;
    private Boolean bursa;

    public Student(String nume, String prenume, Integer varsta, String facultate, String cursuri, Boolean bursa) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.cursuri = cursuri;
        this.bursa = bursa;
    }

    public void infoStudent(){
        System.out.println("Studentul " + getNume() + " este student la facultatea " + facultate);
        System.out.println("Studentul " + getPrenume() + " are cursuri de  " + cursuri);
        System.out.println("Varsta studentul " + getNume() + " " + getPrenume() + " este " + getVarsta() + " si are/nu are bursa "
        + bursa);

    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public String getCursuri() {
        return cursuri;
    }

    public String getFacultate() {
        return facultate;
    }

    public Boolean getBursa() {
        return bursa;
    }

    // polimorfism dinamic ---> A doua implementare a metodei
    public void mananca(){
        System.out.println("Studentul mananca cand are bani.");
    }

    // polimorfism static
    public void invata(){
        System.out.println("Studentul invata doar in sesiune.");
    }

    public void invata(String curs){
        System.out.println("Studentul invata  pentru cursul: " + curs);
    }

    public void invata(int timp){
        System.out.println("Studentul invata: " + timp + " ore pe zi.");
    }


}
