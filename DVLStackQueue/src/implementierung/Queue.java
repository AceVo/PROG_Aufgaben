package implementierung;

import schnittstellen.IList;
import schnittstellen.IQueue;

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
        return 0;
    }

    public void enqueue(int value)
    {

    }

    public int front()
    {
        return 0;
    }
}
