package algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest
{
    private int[] list;

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
    }

    @Test
    void bubbleUp()
    {
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