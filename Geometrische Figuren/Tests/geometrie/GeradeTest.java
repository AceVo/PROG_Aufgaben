package geometrie;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeradeTest {

    private static Gerade myGerade1;
    private static Gerade myGerade2;
    private static Gerade myGerade3;
    private static Gerade myGerade4;


    @BeforeAll
    static void setUp() {
        System.out.println("Gerade Test Setup");
        System.out.println("--------------------");
        myGerade1 = new Gerade(new Punkt(0,0),new Punkt(10,10));
        myGerade2 = new Gerade(new Punkt(10,10), new Punkt(0,0));
        myGerade3 = new Gerade(new Punkt(5,5), new Punkt(20,20));
        myGerade4 = new Gerade(new Punkt(0,0), new Punkt(10,10));
    }

    @Test
    void laenge() {
        System.out.println("Laenge Test");
        assertEquals(Math.sqrt(200),myGerade1.laenge());
        assertEquals(Math.sqrt(200),myGerade2.laenge());
    }

    @Test
    void istLaengerAls() {
        System.out.println("istLaengerAls Test");
        assertTrue(myGerade3.istLaengerAls(myGerade2));
        assertFalse(myGerade2.istLaengerAls(myGerade1));
        assertFalse(myGerade1.istLaengerAls(myGerade3));
    }

    @Test
    void equals() {
        System.out.println("Equals Test");
        assertTrue(myGerade1.equals(myGerade4));
        assertFalse(myGerade1.equals(myGerade3));
    }

    @AfterAll
    static void ende()
    {
        System.out.println();
        System.out.println();
    }
}