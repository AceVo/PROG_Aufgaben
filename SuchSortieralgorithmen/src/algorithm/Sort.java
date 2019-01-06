package algorithm;

public class Sort
{
    public static void bubbleSort(int[] list)
    {
        bubbleSort(list,0,list.length-1);
    }

    public static void bubbleSort(int[] list, int leftIdx, int rightIdx)
    {
        try
        {
            for (int i=rightIdx; i>=leftIdx; i--)
            {
                bubbleUp(list,leftIdx,i);
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            throw new IllegalArgumentException();
        }
    }

    public static void bubbleUp(int[] list, int leftIdx, int i)
    {
        try
        {
            for(int j = leftIdx; j < i; j++)
            {
                if (list[j] > list[j+1])
                {
                    int tmp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = tmp;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            throw new IllegalArgumentException();
        }
    }

    public static void quickSort(int[] list ){}

    public static void quickSort(int[] list, int leftIdx, int ricghtIdx){}

    public static int divide(int[] list, int leftIdx, int rightIdx)
    {
        try
        {
            int i;
            int j;

            do
            {
                for (i = leftIdx; i < rightIdx; i++)
                {
                    if (list[i] >= list[rightIdx])
                    {
                        break;
                    }
                }
                for (j = rightIdx - 1; j > i; j--)
                {
                    if (list[j] < list[rightIdx])
                    {
                        break;
                    }
                }
                if (i < j)
                {
                    swap(list, i, j);

                }
            }while(i<j);
            swap(list,i,rightIdx);
            return i;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            throw new IllegalArgumentException();
        }
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
