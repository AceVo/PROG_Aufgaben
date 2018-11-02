package geometrie;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PunktTest
{

    private static Punkt myPunkt;
    private static Punkt myPunkt2;
    private static Punkt myPunkt3;
    private static Punkt myPunkt4;

    @BeforeAll
    public static void create()
    {
        System.out.println("Punkt Test SetUp");
        System.out.println("--------------------");
        myPunkt = new Punkt(0,0);
        myPunkt2 = new Punkt (2,0);
        myPunkt3 = new Punkt (2,0);
        myPunkt4 = new Punkt (10,10);
    }

    @Test void abstand()
    {
        System.out.println("Abstand Test");
        assertEquals(2,myPunkt.abstand(myPunkt2));
        assertEquals(2,myPunkt2.abstand(myPunkt));
        assertEquals(Math.sqrt(200),myPunkt4.abstand(myPunkt));
        assertEquals(Math.sqrt(200),myPunkt.abstand(myPunkt4));
    }

    @Test void verschieben()
    {
        System.out.println("Verschieben Test");
        myPunkt.verschieben(2,0);
        assertEquals(2,myPunkt.getxKoordinate());
        assertEquals(0, myPunkt.getyKoordinate());
    }

    @Test void equals()
    {
        System.out.println("Equals Test");
        assertTrue(myPunkt2.equals(myPunkt3));
    }

    @AfterAll
    static void ende()
    {
        System.out.println();
        System.out.println();
    }

}