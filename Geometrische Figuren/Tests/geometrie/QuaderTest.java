package geometrie;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuaderTest
{

    private static Quader myQuader1;
    private static Quader myQuader2;

    @BeforeAll
    static void setUp()
    {
        System.out.println("Quader Test SetUp");
        System.out.println("--------------------");
        myQuader1 = new Quader(new Rechteck(new Punkt(0,0),10,10),10);
        myQuader2 = new Quader(new Rechteck(new Punkt(5,5),15,15),20);

    }

    @Test
    void laengeRaumdiagonale()
    {
        System.out.println("Abstand Test");
        assertEquals(Math.sqrt(10*10+10*10+10*10),myQuader1.laengeRaumdiagonale());
        assertEquals(Math.sqrt(15*15+15*15+20*20),myQuader2.laengeRaumdiagonale());
    }

    @Test
    void istWuerfel()
    {
        System.out.println("istWürfel Test");
        assertTrue(Quader.istWuerfel(myQuader1));
        assertFalse(Quader.istWuerfel(myQuader2));
        assertFalse(Quader.istWuerfel(new Punkt(0,0)));
    }

    @Test
    void volumen()
    {
        System.out.println("Volumen Test");
        assertEquals(10*10*10, myQuader1.volumen());
        assertEquals(15*15*20,myQuader2.volumen());
    }

    @Test
    void oberflaeche()
    {
        System.out.println("Oberfläche Test");
        assertEquals(2*10*10+2*10*10+2*10*10,myQuader1.oberflaeche());
        assertEquals(2*15*15+2*15*20+2*15*20,myQuader2.oberflaeche());
    }

    @AfterAll
    static void ende()
    {
        System.out.println("\n");
    }

}