package geometrie;

public class Kreis extends Figur2D
{
    private static final int DEFAULT_RADIUS = 5;
    private int radius;

    public Kreis(Punkt bezug,int radius)
    {
        super(bezug);
        this.setRadius(radius);
    }

    public Kreis(Punkt bezug)
    {
        this(bezug,DEFAULT_RADIUS);
    }

    @Override
    public double umfang()
    {
        return Math.PI*2*radius;
    }

    @Override
    public double flaeche()
    {
        return Math.PI*Math.pow(radius,2);
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius > 0 ? radius : 1;
    }

}
