package oop.mostenire;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainTest extends BaseTest{
    @BeforeClass
    public void initTest(){
        System.out.println("Initializare MainTest");
    }

    @Test
    public void mainTest(){
        System.out.println("Executare MainTest");
    }

}
