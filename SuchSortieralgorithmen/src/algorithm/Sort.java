package algorithm;

public class Sort
{
    public static void bubbleSort(int[] list){}

    public static void bubbleSort(int[] list, int leftIdx, int rightIdx){}

    public static void bubbleUp(int[] list, int leftIdx, int i){}

    public static void quickSort(int[] list ){}

    public static void quickSort(int[] list, int leftIdx, int ricghtIdx){}

    public static void divide(int[] list, int leftIdx, int rightIdx){}

    public static void swap(int[] list, int i, int j){}

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
