package geometrie;

public class Zylinder extends Figur3D
{

    private int hoehe;

    Zylinder(Kreis k, int hoehe)
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
}
