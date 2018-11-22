package aufgabe;

import geometrie.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AufgabePoolTest
{

    private static AufgabePool myAufgabe;
    private static Quader myQuader;
    private static Zylinder myZylinder1;
    private static Zylinder myZylinder2;
    private static Zylinder myZylinder3;

    @BeforeAll
    static void setup ()
    {
        myAufgabe = new AufgabePool();

        myQuader = myAufgabe.getQ();
        myZylinder1 = myAufgabe.getZ1();
        myZylinder2 = myAufgabe.getZ2();
        myZylinder3 = myAufgabe.getZ3();

    }

    @Test
    void Parameter()
    {

        System.out.println("---Parameter Überprüfung ---");

        System.out.println("--- Quader q ---");
        System.out.println("Bezug: X: " + myQuader.getBoden().getBezug().getXKoordinate() + " Y: " + myQuader.getBoden().getBezug().getYKoordinate());
        System.out.println("Länge: " + myQuader.getBoden().getLaenge());
        System.out.println("Breite: " + myQuader.getBoden().getBreite());
        System.out.println();
        assertEquals(74, myQuader.getBoden().getBezug().getXKoordinate());
        assertEquals(390,myQuader.getBoden().getBezug().getYKoordinate());
        assertEquals(875,myQuader.getBoden().getLaenge());
        assertEquals(316,myQuader.getBoden().getBreite());

        System.out.println("--- Zylinder z1 ---");
        System.out.println("Bezug: X: " + myZylinder1.getBoden().getBezug().getXKoordinate() + " Y: " + myZylinder1.getBoden().getBezug().getYKoordinate());
        System.out.println("Durchmesser: " + myZylinder1.getBoden().getRadius()*2);
        System.out.println();
        assertEquals(949-(316/2),myZylinder1.getBoden().getBezug().getXKoordinate());
        assertEquals(390,myZylinder1.getBoden().getBezug().getYKoordinate());
        assertEquals(316, myZylinder1.getBoden().getRadius()*2);

        System.out.println("--- Zylinder z2 ---");
        System.out.println("Bezug: X: " + myZylinder2.getBoden().getBezug().getXKoordinate() + " Y: " + myZylinder2.getBoden().getBezug().getYKoordinate());
        System.out.println("Durchmesser: " + myZylinder2.getBoden().getRadius()*2);
        System.out.println();
        assertEquals(0,myZylinder2.getBoden().getBezug().getXKoordinate());
        assertEquals(390,myZylinder2.getBoden().getBezug().getYKoordinate());
        assertEquals((316-20)/2, myZylinder2.getBoden().getRadius()*2);

        System.out.println("--- Zylinder z3 ---");
        System.out.println("Bezug: X: " + myZylinder3.getBoden().getBezug().getXKoordinate() + " Y: " + myZylinder3.getBoden().getBezug().getYKoordinate());
        System.out.println("Durchmesser: " + myZylinder3.getBoden().getRadius()*2);
        System.out.println();
        assertEquals(0,myZylinder3.getBoden().getBezug().getXKoordinate());
        assertEquals(74+(316-20)/2,myZylinder3.getBoden().getBezug().getYKoordinate());
        assertEquals((316-20)/2, myZylinder3.getBoden().getRadius()*2);

    }

    @Test
    void poolVolumen()
    {
        System.out.println("---Pool Volumen Überprüfung ---");
        assertEquals(myQuader.volumen()+myZylinder1.volumen()/2+myZylinder2.volumen(),myAufgabe.poolVolumen());
    }

    @Test
    void poolUmfang()
    {
        System.out.println("---Pool Umfang Überprüfung ---");
        double z1Umfang, qUmfang, z2Umfang;

        z1Umfang = myZylinder1.getBoden().umfang() / 2;
        z2Umfang = myZylinder2.getBoden().umfang();
        qUmfang = 2 * myQuader.getBoden().getLaenge() + myQuader.getBoden().getBreite() - 2 * myZylinder2.getBoden().getRadius() * 2;
        assertEquals(z1Umfang + z2Umfang + qUmfang, myAufgabe.poolUmfang());
    }

    @Test
    void poolInnererMantel()
    {
        System.out.println("---Pool Innerer Mantel Überprüfung ---");
        double z1Mantel, qMantel, z2Mantel;

        Rechteck myRechteck1 = new Rechteck(myQuader.getBoden().getBezug(),myQuader.getBoden().getBreite(),myQuader.getHoehe());
        Rechteck myRechteck2 = new Rechteck(myQuader.getBoden().getBezug(),
                2 * myZylinder2.getBoden().getRadius(), myZylinder2.getHoehe());

        z1Mantel = (myZylinder1.oberflaeche() - myZylinder1.getBoden().flaeche()) / 2;
        z2Mantel = myZylinder2.oberflaeche() - myZylinder2.getBoden().flaeche();
        qMantel = myQuader.oberflaeche() - myQuader.getBoden().flaeche() - myRechteck1.flaeche() - 2 * myRechteck2.flaeche();
        assertEquals(z1Mantel + z2Mantel + qMantel, myAufgabe.poolInnererMantel());
    }

    @Test
    void poolWasserOberflaeche()
    {
        System.out.println("---Pool Wasseroberfläche Überprüfung ---");
        double z1Oberflaeche, qOberflaeche, z2Oberflaeche;

        z1Oberflaeche = myZylinder1.getBoden().flaeche() / 2;
        qOberflaeche = myQuader.getBoden().flaeche();
        z2Oberflaeche = myZylinder2.getBoden().flaeche();
        assertEquals(z1Oberflaeche + z2Oberflaeche + qOberflaeche, myAufgabe.poolWasserOberflaeche());
    }

    @Test
    void kostenZaun()
    {
        System.out.println("---Pool Kosten Zaun Überprüfung ---");
        assertEquals(Math.ceil(myAufgabe.poolUmfang()/5)*1.75,myAufgabe.kostenZaun(1.75));
    }
}


