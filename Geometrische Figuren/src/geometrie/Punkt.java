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

    public int getxKoordinate()
    {
        return xKoordinate;
    }

    public void setxKoordinate(int xKoordinate)
    {
        this.xKoordinate = xKoordinate;
    }

    public int getyKoordinate()
    {
        return yKoordinate;
    }

    public void setyKoordinate(int yKoordinate)
    {
        this.yKoordinate = yKoordinate;
    }

    public double abstand(Punkt p)
    {
        double erg1=Math.pow(xKoordinate-p.getxKoordinate(),2);
        double erg2=Math.pow(yKoordinate-p.getyKoordinate(),2);
        return Math.sqrt(erg1+erg2);
    }

    public void verschieben (int deltaX, int deltaY)
    {
        xKoordinate+=deltaX;
        yKoordinate+=deltaY;
    }

    public boolean equals (Punkt p1)
    {
        if (xKoordinate==p1.getxKoordinate() && yKoordinate==p1.yKoordinate)
        {
            return true;
        }
        return false;
    }
}
