package implementierung;

import schnittstellen.IList;
import schnittstellen.IStack;

public class Stack implements IStack
{

    private List stack;

    private static final int MAXLENGTH = 7;

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
        return stack.getLength();
    }

    public boolean isEmpty()
    {
        return stack.getLength()==0;
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
        if (value>=0 && getSize()<MAXLENGTH)
        {
            stack.insertAtTheEnd(new ValueElement(null,value));
        }
    }

    public int top()
    {
        return 0;
    }
}
