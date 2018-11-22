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

        return q.volumen() + z1.volumen() / 2 + z2.volumen();
    }

    public double poolUmfang()
    {
        double z1Umfang, qUmfang, z2Umfang;

        z1Umfang = z1.getBoden().umfang() / 2;
        z2Umfang = z2.getBoden().umfang();
        qUmfang = 2 * q.getBoden().getLaenge() + q.getBoden().getBreite() - 2 * z2.getBoden().getRadius() * 2;

        return z1Umfang + z2Umfang + qUmfang;
    }

    public double poolInnererMantel()
    {
        double z1Mantel, qMantel, z2Mantel;
        Rechteck myRechteck1 = new Rechteck(q.getBoden().getBezug(),q.getBoden().getBreite(),q.getHoehe());
        Rechteck myRechteck2 = new Rechteck(q.getBoden().getBezug(),
                2 * z2.getBoden().getRadius(), q.getHoehe());

        z1Mantel = (z1.oberflaeche() - z1.getBoden().flaeche()) / 2;
        z2Mantel = z2.oberflaeche() - z2.getBoden().flaeche();
        qMantel = q.oberflaeche() - q.getBoden().flaeche() - myRechteck1.flaeche() - 2 * myRechteck2.flaeche();

        return z1Mantel + z2Mantel + qMantel;
    }

    public double poolWasserOberflaeche()
    {
        double z1Oberflaeche, qOberflaeche, z2Oberflaeche;

        z1Oberflaeche = z1.getBoden().flaeche() / 2;
        qOberflaeche = q.getBoden().flaeche();
        z2Oberflaeche = z2.getBoden().flaeche();

        return z1Oberflaeche + z2Oberflaeche + qOberflaeche;
    }

    public double kostenZaun (double preisProStueck)
    {
        double preis = preisProStueck > 0 ? preisProStueck : 1.75;

        return (int) Math.ceil(this.poolUmfang()/5) * preis;
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