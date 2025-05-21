package obiectConstructor;

import org.testng.annotations.Test;

public class AvionTest {
    @Test
    public void metodaAvionTest(){
        System.out.println("====Exemplul 1 ====");
        Avion Lufthansa = new Avion("Boeing", "747", "PASAGERI", "SUA", 180, 350, 5);
        Lufthansa.infoAvion();
        System.out.println("====Exemplul 2 ====");
        Avion WizzAir = new Avion("Airbus", "347", "pasageri", "Franta", 160, 4);
        WizzAir.infoAvion();
    }
}
