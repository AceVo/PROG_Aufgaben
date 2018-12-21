import implementierung.List;
import implementierung.ValueElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import schnittstellen.IList;
import schnittstellen.IListElement;
import schnittstellen.IValueElement;

import static org.junit.jupiter.api.Assertions.*;

class ListTest
{

    private IList myList;
    private IValueElement myValueElement1;
    private IValueElement myValueElement2;
    private IValueElement myValueElement3;
    private IValueElement myValueElement4;
    private IValueElement myValueElement5;

    @BeforeEach
    void setUp()
    {
        myList = new List();
        myValueElement1 = new ValueElement("Test01",0);
        myValueElement2 = new ValueElement("Test02",1);
        myValueElement3 = new ValueElement("Test03",2);
        myValueElement4 = new ValueElement(null,99);
        myValueElement5 = null;
    }

    @Test
    void getHead()
    {
        assertTrue(myList.getHead()==myList.getHead());
    }

    @Test
    void insertAtTheEnd()
    {
        myList.insertAtTheEnd(myValueElement1);
        assertTrue(myList.getHead().getSuccessor().getValueElement()==myValueElement1);
    }

    @Test
    void insertAtPos()
    {
    }
}