package geometrie;

public class Quader extends Figur3D
{

    private int hoehe;

    public Quader (Rechteck r, int hoehe)
    {
        super(r);
        setHoehe(hoehe);
    }

    public double laengeRaumdiagonale()
    {
        int l = getBoden().getLaenge();
        int b = getBoden().getBreite();
        int h = hoehe;
        return  Math.sqrt(Math.pow(l,2) + Math.pow(b,2) + Math.pow(h,2));
    }

    public static boolean istWuerfel (Object o)
    {
        if (o instanceof Quader)
        {
            int l = ((Quader) o).getBoden().getLaenge();
            int b = ((Quader) o).getBoden().getBreite();
            int h = ((Quader) o).hoehe;
            return l == b && b == h;
        }
        return false;
    }

    @Override
    public double volumen()
    {
        return getBoden().getLaenge()*getBoden().getBreite()*hoehe;
    }

    @Override
    public double oberflaeche()
    {
        int l = getBoden().getLaenge();
        int b = getBoden().getBreite();
        int h = hoehe;

        return 2*l*b+2*l*h+2*b*h;
    }

    public int getHoehe()
    {
        return hoehe;
    }

    public void setHoehe(int hoehe)
    {
        this.hoehe = hoehe > 0 ? hoehe : 1;
    }

    public Rechteck getBoden()
    {
        Figur2D myBoden = super.getBoden();
        return (Rechteck) myBoden;
    }

    public boolean equals(Figur3D f)
    {
        if (f instanceof Quader)
        {
            int fl = ((Quader) f).getBoden().getLaenge();
            int fb = ((Quader) f).getBoden().getBreite();
            int fh = ((Quader) f).getHoehe();

            return fl == getBoden().getLaenge() && fb == getBoden().getBreite() && fh == hoehe;
        }
        return false;
    }
}
