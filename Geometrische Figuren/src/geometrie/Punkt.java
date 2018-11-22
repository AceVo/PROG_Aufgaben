package geometrie;

public class Punkt
{
    private int xKoordinate;
    private int yKoordinate;

   /* public Punkt()
    {
        this(0,0);
    }*/

    public Punkt(int x, int y)
    {
        this.xKoordinate=x;
        this.yKoordinate=y;
    }

    public Punkt(Punkt p2)
    {
        this(p2.xKoordinate,p2.yKoordinate);
    }

    public int getXKoordinate()
    {
        return xKoordinate;
    }

    public void setXKoordinate(int xKoord)
    {
        this.xKoordinate = xKoord;
    }

    public int getYKoordinate()
    {
        return yKoordinate;
    }

    public void setYKoordinate(int yKoord)
    {
        this.yKoordinate = yKoord;
    }

    public double abstand(Punkt p)
    {
        double erg1=Math.pow(xKoordinate-p.getXKoordinate(),2);
        double erg2=Math.pow(yKoordinate-p.getYKoordinate(),2);
        return Math.sqrt(erg1+erg2);
    }

    public void verschieben (int deltaX, int deltaY)
    {
        xKoordinate+=deltaX;
        yKoordinate+=deltaY;
    }

    public boolean equals (Punkt p1)
    {
        if (xKoordinate==p1.getXKoordinate() && yKoordinate==p1.yKoordinate)
        {
            return true;
        }
        return false;
    }
}
