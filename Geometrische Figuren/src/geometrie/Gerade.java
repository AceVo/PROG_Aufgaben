package geometrie;

public class Gerade
{
    private Punkt startPos;
    private Punkt endPos;

    /*private Gerade ()
    {
        this(new Punkt(0,0),new Punkt(1,0));
    }*/

    Gerade (Punkt start, Punkt ende)
    {
        startPos = start;
        endPos = ende;
    }

    public Punkt getStartPos()
    {
        return startPos;
    }

    public void setStartPos(Punkt startPos)
    {
        this.startPos = startPos;
    }

    public Punkt getEndPos()
    {
        return endPos;
    }

    public void setEndPos(Punkt endPos)
    {
        this.endPos = endPos;
    }

    public double laenge ()
    {
        return startPos.abstand(endPos);
    }

    public boolean istLaengerAls (Gerade g2)
    {
        if (this.laenge()>g2.laenge())
        {
            return true;
        }
        return false;
    }

    public boolean equals (Gerade g2)
    {
        if (this.startPos.equals(g2.startPos) && this.endPos.equals(g2.endPos))
        {
            return true;
        }
        return false;
    }
}
