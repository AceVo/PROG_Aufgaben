package aufgabe;

import geometrie.Quader;
import geometrie.Zylinder;
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
    }

    @Test
    void Parameter()
    {
        myQuader = myAufgabe.getQ();
        myZylinder1 = myAufgabe.getZ1();
        myZylinder2 = myAufgabe.getZ2();
        myZylinder3 = myAufgabe.getZ3();

        System.out.println("---Parameter Überprüfung ---");

        System.out.println("--- Quader q ---");
        System.out.println("Bezug: X: " + myQuader.getBoden().getBezug().getxKoordinate() + " Y: " + myQuader.getBoden().getBezug().getyKoordinate());
        System.out.println("Länge: " + myQuader.getBoden().getLaenge());
        System.out.println("Breite: " + myQuader.getBoden().getBreite());
        System.out.println();
        assertEquals(74, myQuader.getBoden().getBezug().getxKoordinate());
        assertEquals(390,myQuader.getBoden().getBezug().getyKoordinate());
        assertEquals(875,myQuader.getBoden().getLaenge());
        assertEquals(316,myQuader.getBoden().getBreite());

        System.out.println("--- Zylinder z1 ---");
        System.out.println("Bezug: X: " + myZylinder1.getBoden().getBezug().getxKoordinate() + " Y: " + myZylinder1.getBoden().getBezug().getyKoordinate());
        System.out.println("Durchmesser: " + myZylinder1.getBoden().getRadius()*2);
        System.out.println();
        assertEquals(949-(316/2),myZylinder1.getBoden().getBezug().getxKoordinate());
        assertEquals(390,myZylinder1.getBoden().getBezug().getyKoordinate());
        assertEquals(316, myZylinder1.getBoden().getRadius()*2);

        System.out.println("--- Zylinder z2 ---");
        System.out.println("Bezug: X: " + myZylinder2.getBoden().getBezug().getxKoordinate() + " Y: " + myZylinder2.getBoden().getBezug().getyKoordinate());
        System.out.println("Durchmesser: " + myZylinder2.getBoden().getRadius()*2);
        System.out.println();
        assertEquals(0,myZylinder2.getBoden().getBezug().getxKoordinate());
        assertEquals(390,myZylinder2.getBoden().getBezug().getyKoordinate());
        assertEquals((316-20)/2, myZylinder2.getBoden().getRadius()*2);

        System.out.println("--- Zylinder z3 ---");
        System.out.println("Bezug: X: " + myZylinder3.getBoden().getBezug().getxKoordinate() + " Y: " + myZylinder3.getBoden().getBezug().getyKoordinate());
        System.out.println("Durchmesser: " + myZylinder3.getBoden().getRadius()*2);
        System.out.println();
        assertEquals(0,myZylinder3.getBoden().getBezug().getxKoordinate());
        assertEquals(74+(316-20)/2,myZylinder3.getBoden().getBezug().getyKoordinate());
        assertEquals((316-20)/2, myZylinder3.getBoden().getRadius()*2);

    }
}


