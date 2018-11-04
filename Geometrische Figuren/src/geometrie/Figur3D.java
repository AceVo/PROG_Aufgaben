package geometrie;

public abstract class Figur3D
{

    private Figur2D boden;

    Figur3D(Figur2D f)
    {
        boden = f;
    }

    public Figur2D getBoden()
    {
        return boden;
    }

    public void setBoden(Figur2D boden)
    {
        this.boden = boden;
    }

    abstract double volumen();

    abstract double oberflaeche();

}
