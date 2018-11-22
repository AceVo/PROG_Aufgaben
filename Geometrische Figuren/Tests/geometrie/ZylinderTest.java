package geometrie;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZylinderTest
{

    private static Zylinder myZylinder1;
    private static Zylinder myZylinder2;

    @BeforeAll
    static void setUp()
    {
        System.out.println("Zylinder Test SetUp");
        System.out.println("--------------------");
        myZylinder1 = new Zylinder(new Kreis(new Punkt(0,0),5),10);
        myZylinder2 = new Zylinder(new Kreis(new Punkt(10,10),10),15);
    }

    @Test
    void volumen()
    {
        System.out.println("Volumen Test");
        assertEquals(Math.PI*5*5*10,myZylinder1.volumen());
        assertEquals(Math.PI*10*10*15,myZylinder2.volumen());
    }

    @Test
    void oberflaeche()
    {
        System.out.println("Oberfläche Test");
        assertEquals(2*Math.PI*5*5+2*Math.PI*5*10,myZylinder1.oberflaeche());
        assertEquals(2*Math.PI*10*10+2*Math.PI*10*15,myZylinder2.oberflaeche());
    }

    @AfterAll
    static void ende()
    {
        System.out.println("\n");
    }
}