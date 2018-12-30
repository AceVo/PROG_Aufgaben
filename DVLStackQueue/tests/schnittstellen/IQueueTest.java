package schnittstellen;

import implementierung.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IQueueTest
{

    private IQueue myQueue;

    @BeforeEach void setUp()
    {
        myQueue = new Queue();
    }

    @Test void getSize()
    {
        assertTrue(myQueue.getSize()==0);

        myQueue.enqueue(1);
        assertTrue(myQueue.getSize()==1);

        myQueue.enqueue(2);
        assertTrue(myQueue.getSize()==2);

        myQueue.enqueue(3);
        assertTrue(myQueue.getSize()==3);

        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        assertTrue(myQueue.getSize()==7);

        myQueue.enqueue(8);
        assertTrue(myQueue.getSize()==7);

        myQueue.dequeue();
        assertTrue(myQueue.getSize()==6);
    }

    @Test void isEmpty()
    {
        assertTrue(myQueue.isEmpty());

        myQueue.enqueue(1);
        assertFalse(myQueue.isEmpty());

        myQueue.dequeue();
        assertTrue(myQueue.isEmpty());
    }

    @Test void isFull()
    {
        assertFalse(myQueue.isFull());

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        assertTrue(myQueue.isFull());

        myQueue.dequeue();
        assertFalse(myQueue.isFull());
    }

    @Test void dequeue()
    {
        myQueue.enqueue(1);
        assertTrue(myQueue.dequeue()==1);

        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        assertTrue(myQueue.dequeue()==2);
        assertTrue(myQueue.dequeue()==3);
        assertTrue(myQueue.dequeue()==4);
        assertTrue(myQueue.dequeue()==5);
        assertTrue(myQueue.dequeue()==-1);
    }

    @Test void enqueue()
    {
        assertTrue(myQueue.isEmpty());

        myQueue.enqueue(1);
        assertTrue(myQueue.getSize()==1);

        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        assertTrue(myQueue.isFull());

        myQueue.enqueue(8);
        assertTrue(myQueue.getSize()==7);
        assertTrue(myQueue.dequeue()==2);

        myQueue.enqueue(-10);
        assertTrue(myQueue.getSize()==6);
        assertTrue(myQueue.dequeue()==3);
    }

    @Test void front()
    {
        assertTrue(myQueue.isEmpty());

        myQueue.enqueue(1);
        assertTrue(myQueue.front()==1);

        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        assertTrue(myQueue.front()==2);

        myQueue.dequeue();
        assertTrue(myQueue.front()==4);
    }
}