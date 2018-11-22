package geometrie;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KreisTest
{

    private static Kreis myKreis1;
    private static Kreis myKreis2;

    @BeforeAll
    static void setUp()
    {
        System.out.println("Kreis Test Setup");
        System.out.println("--------------------");
        myKreis1 = new Kreis(new Punkt(0,0));
        myKreis2 = new Kreis(new Punkt(0,0),10);
    }

    @Test
    void umfang()
    {
        System.out.println("Umfang Test");
        assertEquals(Math.PI*2*5,myKreis1.umfang());
        assertEquals(Math.PI*2*10, myKreis2.umfang());
    }

    @Test
    void flaeche()
    {
        System.out.println("Fläche Test");
        assertEquals(Math.PI*Math.pow(5,2),myKreis1.flaeche());
        assertEquals(Math.PI*Math.pow(10,2),myKreis2.flaeche());
    }

    @AfterAll
    static void ende()
    {
        System.out.println("\n");
    }

}