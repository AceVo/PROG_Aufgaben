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
        assertTrue(myList.getHead().getValueElement().getValue()==0);
        assertNull(myList.getHead().getSuccessor());
        assertNull(myList.getHead().getPredecessor());

        myList.insertAtPos(0,myValueElement1);
        assertTrue(myList.getHead().getSuccessor().getValueElement()==myValueElement1);
        assertTrue(myList.getHead().getPredecessor().getValueElement()==myValueElement1);
        assertNull(myList.getHead().getPredecessor().getSuccessor());

        myList.insertAtPos(10,myValueElement2);
        assertTrue(myList.getHead().getPredecessor().getValueElement()==myValueElement2);
        assertTrue(myList.getHead().getPredecessor().getPredecessor().getValueElement()==myValueElement1);
        assertTrue(myList.getHead().getSuccessor().getValueElement()==myValueElement1);
        assertNull(myList.getHead().getPredecessor().getSuccessor());

        myList.insertAtPos(2,myValueElement3);
        assertTrue(myList.getHead().getSuccessor().getValueElement()==myValueElement1);
        assertTrue(myList.getHead().getPredecessor().getValueElement()==myValueElement2);
        assertTrue(myList.getHead().getPredecessor().getPredecessor().getValueElement()==myValueElement3);
    }

    @Test void getElementAt()
    {
        myList.insertAtTheEnd(myValueElement1);
        myList.insertAtTheEnd(myValueElement2);
        myList.insertAtTheEnd(myValueElement3);

        assertTrue(myList.getElementAt(1)==myValueElement1);
        assertTrue(myList.getElementAt(2)==myValueElement2);
        assertTrue(myList.getElementAt(3)==myValueElement3);
        assertNull(myList.getElementAt(0));
        assertNull(myList.getElementAt(-1));
        assertNull(myList.getElementAt(4));
    }

    @Test void getFirstPosOf()
    {
        assertTrue(myList.getFirstPosOf(myList.getHead().getValueElement())==0);

        myList.insertAtTheEnd(myValueElement1);
        assertTrue(myList.getFirstPosOf(myList.getHead().getValueElement())==0);
        assertTrue(myList.getFirstPosOf(myValueElement1)==1);

        myList.insertAtTheEnd(myValueElement2);
        assertTrue(myList.getFirstPosOf(myList.getHead().getValueElement())==0);
        assertTrue(myList.getFirstPosOf(myValueElement1)==1);
        assertTrue(myList.getFirstPosOf(myValueElement2)==2);

        myList.insertAtPos(2,myValueElement3);
        assertTrue(myList.getFirstPosOf(myList.getHead().getValueElement())==0);
        assertTrue(myList.getFirstPosOf(myValueElement1)==1);
        assertTrue(myList.getFirstPosOf(myValueElement2)==3);
        assertTrue(myList.getFirstPosOf(myValueElement3)==2);
        assertTrue(myList.getFirstPosOf(myValueElement4)==-1);
    }

    @Test void deleteFirstOf()
    {
        myList.insertAtTheEnd(myValueElement1);
        myList.insertAtTheEnd(myValueElement2);
        myList.insertAtTheEnd(myValueElement3);

        myList.deleteFirstOf(myValueElement3);
        assertTrue(myList.getHead().getPredecessor().getValueElement()==myValueElement2);
        assertTrue(myList.getHead().getPredecessor().getPredecessor().getValueElement()==myValueElement1);

        myList.deleteFirstOf(myValueElement1);
        assertTrue(myList.getHead().getPredecessor().getValueElement()==myValueElement2);
        assertTrue(myList.getElementAt(1)==myValueElement2);

        myList.deleteFirstOf(myValueElement1);
        assertTrue(myList.getHead().getPredecessor().getValueElement()==myValueElement2);
        assertTrue(myList.getElementAt(1)==myValueElement2);

        myList.deleteFirstOf(myList.getHead().getValueElement());
        assertTrue(myList.getHead().getPredecessor().getValueElement()==myValueElement2);
        assertTrue(myList.getElementAt(1)==myValueElement2);
        assertTrue(myList.getHead().getValueElement().getValue()==0);
        assertTrue(myList.getHead().getValueElement().getName()=="Kopf");
    }

    @Test void deleteAllOf()
    {
        myList.insertAtTheEnd(myValueElement1);
        myList.insertAtTheEnd(myValueElement2);
        myList.insertAtTheEnd(myValueElement1);
        myList.insertAtTheEnd(myValueElement3);

        myList.deleteAllOf(myValueElement1);
        assertTrue(myList.getFirstPosOf(myValueElement1)==-1);
        assertTrue(myList.getFirstPosOf(myValueElement2)==1);
        assertTrue(myList.getFirstPosOf(myValueElement3)==2);

        myList.deleteAllOf(myList.getHead().getValueElement());
        assertTrue(myList.getFirstPosOf(myValueElement2)==1);
        assertTrue(myList.getFirstPosOf(myValueElement3)==2);
    }

    @Test void member()
    {
        myList.insertAtTheEnd(myValueElement1);
        myList.insertAtTheEnd(myValueElement2);
        myList.insertAtTheEnd(myValueElement1);
        myList.insertAtTheEnd(myValueElement3);

        assertTrue(myList.member(myValueElement1));
        assertTrue(myList.member(myValueElement2));
        assertTrue(myList.member(myValueElement3));
        assertFalse(myList.member(myValueElement4));
        assertTrue(myList.member(myList.getHead().getValueElement()));
    }

    @Test void reverse()
    {
        myList.insertAtTheEnd(myValueElement1);
        myList.insertAtTheEnd(myValueElement2);
        myList.insertAtTheEnd(myValueElement3);
        myList.insertAtTheEnd(myValueElement4);

        myList.reverse();

        assertTrue(myList.getHead().getPredecessor().getValueElement()==myValueElement1);
        assertTrue(myList.getHead().getSuccessor().getValueElement()==myValueElement4);
        assertTrue(myList.getElementAt(1)==myValueElement4);
        assertTrue(myList.getElementAt(2)==myValueElement3);
        assertTrue(myList.getElementAt(3)==myValueElement2);
        assertTrue(myList.getElementAt(4)==myValueElement1);
        assertTrue(myList.getHead().getPredecessor().getSuccessor()==null);
        assertTrue(myList.getHead().getSuccessor().getPredecessor()==myList.getHead());

    }

    @Test void String()
    {
        myList.insertAtTheEnd(myValueElement1);
        myList.insertAtTheEnd(myValueElement2);
        myList.insertAtTheEnd(myValueElement3);
        myList.insertAtTheEnd(myValueElement4);

        System.out.println(myList.toString());
    }
}