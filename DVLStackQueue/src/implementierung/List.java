package implementierung;

import schnittstellen.IList;
import schnittstellen.IListElement;
import schnittstellen.IValueElement;

public class List implements IList
{
    private ListElement head;

    public List()
    {
        head = new ListElement(new ValueElement("Kopf", 0));
        head.setPredecessor(head);
    }

    public IListElement getHead()
    {
        return head;
    }

    public void insertAtTheEnd(IValueElement value)
    {
        ListElement newItem = new ListElement(value);

        head.getPredecessor().setSuccessor(newItem);
        newItem.setPredecessor(head.getPredecessor());
        newItem.setSuccessor(null);
        head.setPredecessor(newItem);
    }

    public void insertAtPos(int pos, IValueElement value)
    {
        ListElement newItem = new ListElement(value);
        IListElement elementBeforePos = this.findPosition(pos);

        newItem.setSuccessor(elementBeforePos.getSuccessor());
        newItem.setPredecessor(elementBeforePos);
        elementBeforePos.setSuccessor(newItem);
        if (newItem.getSuccessor() != null)
        {
            newItem.getSuccessor().setPredecessor(newItem);
        }
        else
        {
            head.setPredecessor(newItem);
        }
    }

    public IValueElement getElementAt(int position)
    {
        return null;
    }

    public int getFirstPosOf(IValueElement value)
    {
        return 0;
    }

    public void deleteFirstOf(IValueElement value)
    {

    }

    public void deleteAllOf(IValueElement value)
    {

    }

    public boolean member(IValueElement value)
    {
        return false;
    }

    public void reverse()
    {

    }

    private IListElement findPosition (int searchPos)
    {
        int i = 0;
        IListElement actualElement = head;

        while (i<searchPos && actualElement.getSuccessor() != null)
        {
            actualElement = actualElement.getSuccessor();
            i++;
        }

        return actualElement;
    }
}
