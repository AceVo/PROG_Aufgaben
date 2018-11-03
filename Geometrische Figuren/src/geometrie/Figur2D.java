package geometrie;

public abstract class Figur2D
{
    private Punkt bezug;


    Figur2D(Punkt bezug)
    {
        this.bezug = bezug;
    }

    Figur2D(int bezugX, int bezugY)
    {
        this.bezug = new Punkt(bezugX,bezugY);
    }

    public Punkt getBezug()
    {
        return bezug;
    }

    public void setBezug(Punkt bezug)
    {
        this.bezug = bezug;
    }

    abstract double umfang();

    abstract double flaeche();
}
