package implementierung;

import schnittstellen.IList;
import schnittstellen.IListElement;
import schnittstellen.IValueElement;

public class List implements IList
{
    private ListElement head;
    private int laenge=0;

    public List()
    {
        head = new ListElement(new ValueElement("Kopf", 0));
    }

    public IListElement getHead()
    {
        return head;
    }

    public void insertAtTheEnd(IValueElement value)
    {
        ListElement newItem = new ListElement(value);
        IListElement lastElement;

        if(head.getPredecessor()==null)
        {
            lastElement = head;
        }
        else
        {
            lastElement = head.getPredecessor();
        }

        newItem.setPredecessor(lastElement);
        newItem.setSuccessor(null);
        lastElement.setSuccessor(newItem);
        head.setPredecessor(newItem);
        laenge++;
    }

    public void insertAtPos(int pos, IValueElement value)
    {
        ListElement newItem = new ListElement(value);
        IListElement oldElementAtPos = findElementAtPosition(pos);

        if(pos<=1)
        {
            newItem.setPredecessor(head);
            newItem.setSuccessor(head.getSuccessor());
            head.setSuccessor(newItem);
            if(newItem.getSuccessor()==null)
            {
                head.setPredecessor(newItem);
            }
            else
            {
                newItem.getSuccessor().setPredecessor(newItem);
            }
        }
        else if (pos>laenge)
        {
            newItem.setPredecessor(head.getPredecessor());
            newItem.setSuccessor(null);
            head.setPredecessor(newItem);
            newItem.getPredecessor().setSuccessor(newItem);
        }
        else
        {
            newItem.setSuccessor(oldElementAtPos);
            newItem.setPredecessor(oldElementAtPos.getPredecessor());
            oldElementAtPos.setPredecessor(newItem);
            newItem.getPredecessor().setSuccessor(newItem);
        }
        laenge++;
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

    private IListElement findElementAtPosition(int searchPos)
    {
        int i = 0;
        IListElement actualElement = head;

        if(head.getSuccessor()!=null)
        {
            while (i < searchPos && actualElement.getSuccessor() != null)
            {
                actualElement = actualElement.getSuccessor();
                i++;
            }
        }
        return actualElement;
    }
}
