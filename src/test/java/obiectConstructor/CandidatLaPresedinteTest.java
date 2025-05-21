package obiectConstructor;

import org.testng.annotations.Test;

public class CandidatLaPresedinteTest {

    @Test
    public void verificatPresedinteTest(){
        System.out.println("====Exemplul 1 ====");
        CandidatLaPresedinte candidatPromitator = new CandidatLaPresedinte(10000, "Ionescu");
        System.out.println("Numele canditatului promitator este " + candidatPromitator.getNume() + " si are " + candidatPromitator.getNumarVoturi() + " de voturi");
        System.out.println("====Exemplul 2 ====");
        CandidatLaPresedinte candidatSlab = new CandidatLaPresedinte(2000, "Popescu");
        System.out.println("Numele canditatului promitator este " + candidatSlab.getNume() + " si are " + candidatSlab.getNumarVoturi() + " de voturi");
        System.out.println("====Exemplul 3 ====");
        CandidatLaPresedinte candidatNecunoscut = new CandidatLaPresedinte(300, "");
        System.out.println("Numele canditatului promitator este " + candidatNecunoscut.getNume() + " si are " + candidatNecunoscut.getNumarVoturi() + " de voturi");

    }
}
