package geometrie;


public class Rechteck extends Figur2D
{

    private int breite;
    private int laenge;

    public Rechteck(Punkt bezug,int b, int l)
    {
        super(bezug);
        this.setBreite(b);
        this.setLaenge(l);
    }
    @Override
    public double umfang()
    {
        return 2*breite+2*laenge;
    }

    @Override
    public double flaeche()
    {
        return breite*laenge;
    }

    public int getBreite()
    {
        return breite;
    }

    public void setBreite(int breite)
    {
        this.breite = breite > 0 ? breite : 1 ;
    }

    public int getLaenge()
    {
        return laenge;
    }

    public void setLaenge(int laenge)
    {
        this.laenge = laenge > 0 ? laenge : 1 ;
    }

    public double diagonalenLaenge()
    {
        Punkt p1 = this.getBezug();
        Punkt p2 = new Punkt(p1.getXKoordinate()+this.laenge,p1.getYKoordinate()+this.breite);
        return p1.abstand(p2);
    }

    public boolean flaecheKleinerAls(Figur2D f)
    {
        return this.flaeche() < f.flaeche();
    }

    public boolean umfangKleinerAls (Figur2D f)
    {
        return this.umfang() < f.umfang();
    }
}
