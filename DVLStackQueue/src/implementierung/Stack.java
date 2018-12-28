package implementierung;

import schnittstellen.IList;
import schnittstellen.IListElement;
import schnittstellen.IStack;
import schnittstellen.IValueElement;

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
        if (getSize() > 0)
        {
            IValueElement actualElement = stack.getElementAt(1);
            int value = actualElement.getValue();
            stack.deleteFirstOf(actualElement);
            return value;
        }

        return -1;
    }

    public void push(int value)
    {
        if (value >= 0 && getSize() < MAXLENGTH)
        {
            stack.insertAtPos(1,new ValueElement(null,value));
        }
    }

    public int top()
    {
        return 0;
    }
}
