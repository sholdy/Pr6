package pr6;
public class MyInsertionSort
{
    public static void insertionSort (Comparable[] list)
    {
        Comparable temp;
        int j;
        for (int i = 1; i < list.length; ++i)
        {
            temp = list[i];

            for (j = i; j > 0 && list[j - 1].compareTo(temp) > 0; --j)

                list[j] = list[j - 1];

            list[j] = temp;
        }
    }
}

