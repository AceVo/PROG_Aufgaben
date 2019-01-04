package algorithm;

public class Sort
{
    public static void bubbleSort(int[] list){}

    public static void bubbleSort(int[] list, int leftIdx, int rightIdx){}

    public static void bubbleUp(int[] list, int leftIdx, int i){}

    public static void quickSort(int[] list ){}

    public static void quickSort(int[] list, int leftIdx, int ricghtIdx){}

    public static int divide(int[] list, int leftIdx, int rightIdx)
    {
        return 0;
    }

    public static void swap(int[] list, int i, int j) throws IllegalArgumentException
    {
        try
        {
            int buffer = list[i];
            list[i] = list[j];
            list[j] = buffer;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            throw new IllegalArgumentException();
        }
    }

    public static String toString(int[] list, int start, int end) throws IllegalArgumentException
    {
        try
        {
            if (start > end)
            {
                throw new IllegalArgumentException();
            }

            StringBuilder stringArrayBuilder = new StringBuilder("---------- \r\n");
            for (int i = start; i <= end; i++)
            {
                stringArrayBuilder.append("Pos: ").append(i).append(" | ").append(list[i]).append("\r\n");
            }
            stringArrayBuilder.append("----------");

            return stringArrayBuilder.toString();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            throw new IllegalArgumentException();
        }
    }

    public static String toString(int[] list)
    {
        return toString(list, 0, list.length-1);
    }
}
