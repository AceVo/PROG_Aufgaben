package implementierung;

import schnittstellen.IList;
import schnittstellen.IQueue;
import schnittstellen.IValueElement;

public class Queue implements IQueue
{
    private List queue;

    private static final int MAXLENGTH = 7;

    public Queue()
    {
        queue = new List();
    }

    public IList getDVL()
    {
        return queue;
    }

    public int getSize()
    {
        return queue.getLength();
    }

    public boolean isEmpty()
    {
        return queue.getLength()==0;
    }

    public boolean isFull()
    {
        return queue.getLength()==MAXLENGTH;
    }

    public int dequeue()
    {
        if (getSize()>0)
        {
            IValueElement actualElement = queue.getElementAt(1);
            int value = actualElement.getValue();
            queue.deleteFirstOf(actualElement);
            return value;
        }
        return -1;
    }

    public void enqueue(int value)
    {
        if (value >= 0 && getSize() < 7)
        {
            queue.insertAtTheEnd(new ValueElement(null,value));
        }
    }

    public int front()
    {
        return 0;
    }
}
