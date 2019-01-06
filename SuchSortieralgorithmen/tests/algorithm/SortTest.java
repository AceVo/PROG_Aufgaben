package algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest
{
    private int[] list;
    private int[] unsortedList = {15, 7, 3, 4, 8, 10, 27, 3, 12, 9};
    private int[] sortedList = {3, 3, 4, 7, 8, 9, 10, 12, 15, 27};

    @BeforeEach
    void setUp()
    {
        list = new int[10];
        for (int i = 0; i <= 9; i++)
        {
            list[i]= i + 1;
        }
    }

    @Test
    void bubbleSort()
    {
        int[] myList1 = unsortedList.clone();
        Sort.bubbleSort(myList1,8,9);
        assertTrue(myList1[8]==9);
        assertTrue(myList1[9]==12);

        int[] myList2 = unsortedList.clone();
        Sort.bubbleSort(myList2,0,9);
        assertArrayEquals(myList2, sortedList);

        int[] myList3 = unsortedList.clone();
        int[] mySortedList3 = {15, 7, 3, 3, 4, 8, 10, 27, 12, 9};
        Sort.bubbleSort(myList3, 3, 7);
        assertArrayEquals(myList3, mySortedList3);
        assertThrows(IllegalArgumentException.class, ()-> Sort.bubbleSort(unsortedList, -1, 9));
        assertThrows(IllegalArgumentException.class, ()-> Sort.bubbleSort(unsortedList, 1, 10));

        int[] myList4 = unsortedList.clone();
        Sort.bubbleSort(myList4);
        assertArrayEquals(myList4, sortedList);
    }

    @Test
    void bubbleUp()
    {
        assertTrue(unsortedList[9]==9);

        Sort.bubbleUp(unsortedList,2,6);
        assertTrue(unsortedList[6]==27);
        assertTrue(unsortedList[2]==3);

        Sort.bubbleUp(unsortedList,0,9);
        assertTrue(unsortedList[9]==27);
        assertTrue(unsortedList[6]==9);

        Sort.bubbleUp(unsortedList,0,8);
        assertTrue(unsortedList[8]==15);
        assertTrue(unsortedList[0]==12);

        assertThrows(IllegalArgumentException.class,()->Sort.bubbleUp(unsortedList,-2,8));
        assertThrows(IllegalArgumentException.class,()->Sort.bubbleUp(unsortedList,2,10));
    }

    @Test
    void quickSort()
    {
    }


    @Test
    void divide()
    {
    }

    @Test
    void swap()
    {
        Sort.swap(list,3,8);
        assertTrue(list[3]==9);
        assertTrue(list[8]==4);

        Sort.swap(list, 8, 3);
        assertTrue(list[8]==9);
        assertTrue(list[3]==4);

        assertThrows(IllegalArgumentException.class, () ->Sort.swap(list, -1, 6));
        assertThrows(IllegalArgumentException.class, () ->Sort.swap(list, 10, 6));
        assertThrows(IllegalArgumentException.class, () ->Sort.swap(list, 4, -6));
        assertThrows(IllegalArgumentException.class, () ->Sort.swap(list, 4, 10));
    }

    @Test
    void toStringTest()
    {
        System.out.println(Sort.toString(list));
        assertThrows(IllegalArgumentException.class, () ->Sort.toString(list, -1, 5));
        assertThrows(IllegalArgumentException.class, () ->Sort.toString(list, 1, 10));
        assertThrows(IllegalArgumentException.class, () ->Sort.toString(list, 6, 3));
        System.out.println(Sort.toString(list, 2, 7));
    }

}