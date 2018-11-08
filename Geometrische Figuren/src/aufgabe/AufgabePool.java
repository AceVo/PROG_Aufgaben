package aufgabe;

import geometrie.*;

public class AufgabePool
{
    private Quader q;       // r
    private Zylinder z1;    // k1
    private Zylinder z2;    // k2
    private Zylinder z3;    // k3
    private static int hoehe = 2;

    public AufgabePool()
    {
        q = new Quader(new Rechteck(new Punkt(74,390),316,875),hoehe);
        z1 = new Zylinder(new Kreis(new Punkt(949-(q.getBoden().getBreite()/2),390),q.getBoden().getBreite()/2),hoehe);
        z2 = new Zylinder(new Kreis(new Punkt(0,390),(q.getBoden().getBreite()-20)/4),hoehe);
        z3 = new Zylinder(new Kreis(new Punkt(0,74+z2.getBoden().getRadius()*2),z2.getBoden().getRadius()),hoehe);

    }

    public double poolVolumen()
    {
        return 0;
    }

    public double poolUmfang()
    {
        return 0;
    }

    public double poolInnererMantel()
    {
        return 0;
    }

    public double poolWasserOberflaeche()
    {
        return 0;
    }

    public double kostenZaun (double preisProStueck)
    {
        return 0;
    }

    public Quader getQ ()
    {
        return q;
    }


    public Zylinder getZ1()
    {
        return z1;
    }

    public Zylinder getZ2()
    {
        return z2;
    }

    public Zylinder getZ3()
    {
        return z3;
    }
}