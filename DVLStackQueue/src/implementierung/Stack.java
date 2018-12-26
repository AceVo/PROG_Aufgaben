package implementierung;

import schnittstellen.IList;
import schnittstellen.IStack;

public class Stack implements IStack
{

    private List stack;

    public Stack()
    {
        stack = new List();
    }

    public IList getDVL()
    {
        return stack;
    }

    public int getSize()
    {
        return 0;
    }

    public boolean isEmpty()
    {
        return false;
    }

    public boolean isFull()
    {
        return false;
    }

    public int pop()
    {
        return 0;
    }

    public void push(int value)
    {

    }

    public int top()
    {
        return 0;
    }
}
