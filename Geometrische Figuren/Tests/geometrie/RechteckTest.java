package geometrie;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RechteckTest
{

    private static Rechteck myRechteck1;
    private static Rechteck myRechteck2;
    private static Rechteck myRechteck3;

    @BeforeAll
    static void setUp()
    {
        System.out.println("Rechteck Test SetUp");
        System.out.println("--------------------");
        myRechteck1 = new Rechteck(new Punkt(0,0),10, 10);
        myRechteck2 = new Rechteck(new Punkt(0,0),20, 20);
        myRechteck3 = new Rechteck(new Punkt(0,0),5, 5);

    }

    @Test
    void umfang()
    {
        System.out.println("Umfang Test");
        assertEquals(40,myRechteck1.umfang());
    }

    @Test
    void flaeche()
    {
        System.out.println("Fläche Test");
        assertEquals(100, myRechteck1.flaeche());
    }

    @Test
    void diagonalenLaenge()
    {
        System.out.println("Diagonalen Test");
        assertEquals(Math.sqrt(200),myRechteck1.diagonalenLaenge());
    }

    @Test
    void flaecheKleinerAls()
    {
        System.out.println("Fläche kleiner als Test");
        assertTrue(myRechteck1.flaecheKleinerAls(myRechteck2));
        assertFalse(myRechteck1.flaecheKleinerAls(myRechteck3));
    }

    @Test
    void umfangKleinerAls()
    {
        System.out.println("Umfang kleiner als Test");
        assertTrue(myRechteck1.umfangKleinerAls(myRechteck2));
        assertFalse(myRechteck1.umfangKleinerAls(myRechteck3));

    }
}