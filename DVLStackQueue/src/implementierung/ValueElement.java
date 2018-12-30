package implementierung;

import schnittstellen.IValueElement;

public class ValueElement implements IValueElement
{

    private String name;
    private int value;

    public ValueElement(String name, int value)
    {
        setName(name);
        setValue(value);
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setName(String paramName)
    {
        this.name = paramName==null ? "nichts" : paramName;
    }

    @Override
    public int getValue()
    {
        return value;
    }

    @Override
    public void setValue(int paramValue)
    {
        this.value = paramValue;
    }

    public String toString()
    {
        return "Name des Elements: " + this.name + "; Wert des Elements: " + this.value;
    }
}
