package implementierung;

import schnittstellen.IListElement;
import schnittstellen.IValueElement;

public class ListElement implements IListElement
{
    private IValueElement element;
    private IListElement predecessor;
    private IListElement successor;

    public ListElement(IValueElement value)
    {
        this.setValueElement(value);
    }

    public IValueElement getValueElement()
    {
        return element;
    }

    public void setValueElement(IValueElement value)
    {
        this.element = value!=null ? value : new ValueElement(null,0);
    }

    public IListElement getPredecessor()
    {
        return predecessor;
    }

    public void setPredecessor(IListElement predecessor)
    {
        this.predecessor = predecessor;
    }

    public IListElement getSuccessor()
    {
        return successor;
    }

    public void setSuccessor(IListElement successor)
    {
        this.successor = successor;
    }
}
