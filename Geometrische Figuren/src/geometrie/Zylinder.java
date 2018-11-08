package geometrie;

public class Zylinder extends Figur3D
{

    private int hoehe;

    public Zylinder(Kreis k, int hoehe)
    {
        super(k);
        setHoehe(hoehe);
    }

    @Override
    double volumen()
    {
        return (super.getBoden().flaeche()*hoehe);
    }

    @Override
    double oberflaeche()
    {
        return (2*super.getBoden().flaeche()+super.getBoden().umfang()*hoehe);
    }

    public int getHoehe()
    {
        return hoehe;
    }

    public void setHoehe(int hoehe)
    {
        this.hoehe = hoehe > 0 ? hoehe : 1;
    }

    public Kreis getBoden()
    {
        Figur2D myBoden = super.getBoden();
        return (Kreis) myBoden;
    }

}
