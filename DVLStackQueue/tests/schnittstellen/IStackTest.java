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
    }

    @Test void isFull()
    {
    }

    @Test void pop()
    {
    }

    @Test void push()
    {
    }

    @Test void top()
    {
    }
}