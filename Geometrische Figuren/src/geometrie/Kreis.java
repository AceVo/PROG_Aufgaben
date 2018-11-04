package geometrie;

public class Kreis extends Figur2D
{
    private static final int DEFAULT_RADIUS = 5;
    private int radius;

    Kreis(Punkt bezug,int radius)
    {
        super(bezug);
        this.setRadius(radius);
    }

    Kreis(Punkt bezug)
    {
        this(bezug,DEFAULT_RADIUS);
    }

    @Override
    double umfang()
    {
        return Math.PI*2*radius;
    }

    @Override
    double flaeche()
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
