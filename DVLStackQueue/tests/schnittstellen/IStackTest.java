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
    }

    @Test void isEmpty()
    {
        assertTrue(myStack.isEmpty());
    }

    @Test void isFull()
    {
    }

    @Test void pop()
    {
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
    }
}