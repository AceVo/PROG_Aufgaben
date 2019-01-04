package algorithm;

public class Sort
{
    public static void bubbleSort(int[] list){}

    public static void bubbleSort(int[] list, int leftIdx, int rightIdx){}

    public static void bubbleUp(int[] list, int leftIdx, int i){}

    public static void quickSort(int[] list ){}

    public static void quickSort(int[] list, int leftIdx, int ricghtIdx){}

    public static int divide(int[] list, int leftIdx, int rightIdx){}

    public static void swap(int[] list, int i, int j) throws IllegalArgumentException
    {
        if (i < 0 | i > list.length-1 | j < 0 | j > list.length-1)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            int buffer = list[i];
            list[i] = list[j];
            list[j] = buffer;
        }
    }

    public static String toString(int[] list, int start, int end) throws IllegalArgumentException
    {
        if (start < 0 || end > list.length-1 || start > end)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            String stringArray = "---------- \r\n";

            for (int i = start; i <= end; i++)
            {
                stringArray += "Pos: " + i + " | " + list[i] + "\r\n";
            }

            stringArray += "----------";

            return stringArray;
        }
    }

    public static String toString(int[] list)
    {
        return toString(list, 0, list.length-1);
    }
}
