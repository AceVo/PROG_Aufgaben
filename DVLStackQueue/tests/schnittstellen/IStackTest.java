package schnittstellen;

import implementierung.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IStackTest
{

    private IStack myStack;

    @BeforeEach void setUp()
    {
        myStack = new Stack();
    }

    @Test void getSize()
    {
        assertTrue(myStack.getSize()==0);

        myStack.pop();
        assertTrue(myStack.getSize()==0);

        myStack.push(1);
        assertTrue(myStack.getSize()==1);

        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        assertTrue(myStack.getSize()==4);

        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        assertTrue(myStack.getSize()==7);

        myStack.push(8);
        assertTrue(myStack.getSize()==7);

        myStack.pop();
        myStack.pop();
        assertTrue(myStack.getSize()==5);
    }

    @Test void isEmpty()
    {
        assertTrue(myStack.isEmpty());

        myStack.push(1);
        assertFalse(myStack.isEmpty());

        myStack.pop();
        assertTrue(myStack.isEmpty());
    }

    @Test void isFull()
    {
        assertFalse(myStack.isFull());
        myStack.push(1);
        assertFalse(myStack.isFull());
        myStack.push(2);
        assertFalse(myStack.isFull());
        myStack.push(3);
        assertFalse(myStack.isFull());
        myStack.push(4);
        assertFalse(myStack.isFull());
        myStack.push(5);
        assertFalse(myStack.isFull());
        myStack.push(6);
        assertFalse(myStack.isFull());
        myStack.push(7);
        assertTrue(myStack.isFull());
    }

    @Test void pop()
    {
        assertTrue(myStack.getSize()==0);
        assertTrue(myStack.isEmpty());

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        assertTrue(myStack.getSize()==4);

        assertTrue(myStack.pop()==4);
        assertTrue(myStack.getSize()==3);

        assertTrue(myStack.pop()==3);
        assertTrue(myStack.getSize()==2);

        assertTrue(myStack.pop()==2);
        assertTrue(myStack.getSize()==1);

        myStack.pop();
        assertTrue(myStack.getSize()==0);
        assertTrue(myStack.pop()==-1);
    }

    @Test void push()
    {
        assertTrue(myStack.getSize()==0);
        assertTrue(myStack.isEmpty());

        myStack.push(1);
        assertTrue(myStack.getSize()==1);
        assertFalse(myStack.isEmpty());

        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        assertTrue(myStack.getSize()==4);

        myStack.push(-2);
        assertTrue(myStack.getSize()==4);

        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        assertTrue(myStack.getSize()==7);

        myStack.push(8);
        assertTrue(myStack.getSize()==7);
    }

    @Test void top()
    {
        assertTrue(myStack.isEmpty());
        assertTrue(myStack.top()==-1);

        myStack.push(1);
        assertTrue(myStack.top()==1);
        assertTrue(myStack.getSize()==1);

        myStack.push(2);
        myStack.push(3);
        assertTrue(myStack.top()==3);
        assertTrue(myStack.getSize()==3);
    }
}