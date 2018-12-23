package schnittstellen;

import implementierung.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IListTest
{

    private IList myList;
    private IValueElement myValueElement1;
    private IValueElement myValueElement2;
    private IValueElement myValueElement3;
    private IValueElement myValueElement4;
    private IValueElement myValueElement5;

    @BeforeEach void setUp()
    {
        myList = new List();
        myValueElement1 = new ValueElement("Test01",0);
        myValueElement2 = new ValueElement("Test02",1);
        myValueElement3 = new ValueElement("Test03",2);
        myValueElement4 = new ValueElement(null,99);
        myValueElement5 = null;
    }

    @Test void getHead()
    {
        assertTrue(myList.getHead()==myList.getHead());
        assertTrue(myList.getHead().getValueElement().getValue()==0);
        assertNull(myList.getHead().getSuccessor());
        assertNull(myList.getHead().getPredecessor());
    }

    @Test void insertAtTheEnd()
    {
        assertTrue(myList.getHead().getValueElement().getValue()==0);
        assertNull(myList.getHead().getSuccessor());
        assertNull(myList.getHead().getPredecessor());

        myList.insertAtTheEnd(myValueElement1);
        assertTrue(myList.getHead().getPredecessor().getValueElement()==myValueElement1);
        assertTrue(myList.getHead().getPredecessor().getPredecessor()==myList.getHead());
        assertNull(myList.getHead().getPredecessor().getSuccessor());

        myList.insertAtTheEnd(myValueElement2);
        assertTrue(myList.getHead().getPredecessor().getValueElement()==myValueElement2);
        assertTrue(myList.getHead().getPredecessor().getPredecessor().getValueElement()==myValueElement1);
        assertTrue(myList.getHead().getSuccessor().getValueElement()==myValueElement1);
        assertNull(myList.getHead().getPredecessor().getSuccessor());
    }

    @Test void insertAtPos()
    {
    }

    @Test void getElementAt()
    {
    }

    @Test void getFirstPosOf()
    {
    }

    @Test void deleteFirstOf()
    {
    }

    @Test void deleteAllOf()
    {
    }

    @Test void member()
    {
    }

    @Test void reverse()
    {
    }
}