package obiectConstructor;

public class ContBancar {
    public  String numeTitular;
    public Double soldTitular;

    // facem un constructor parametrizat care verifica soldul initial
    public ContBancar(String nume, double soldInitial){
        this.numeTitular = nume;
        // verificam soldul initial
        if(soldInitial >= 100){
            this.soldTitular = soldInitial;
        } else {
            System.out.println("Soldul initial trebuie sa fie 100 RON . Resetam la 0.");
            this.soldTitular = 0.0;
        }
    }

    public void infoCont(){
        System.out.println("Titularul " + numeTitular + " are soldul " + soldTitular);
    }

}
