package pr6;
import java.util.Arrays;
public class MyMergeSort
{
    static public Comparable[] mergeSort(Comparable[] list1, Comparable[] list2)
    {
        Comparable[] list3 = Arrays.copyOf(list1, list1.length + list2.length);
        System.arraycopy(list2, 0, list3, list1.length, list2.length);
        return _mergeSort(list3);
    }
    public static Comparable[] _mergeSort(Comparable[] array1)
    {
        Comparable[] buffer1 = Arrays.copyOf(array1, array1.length);
        Comparable[] buffer2 = new Comparable[array1.length];
        Comparable[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }
    public static Comparable[] mergesortInner(Comparable[] buffer1, Comparable[] buffer2, int startIndex, int endIndex)
    {
        if (startIndex >= endIndex - 1)
        {
            return buffer1;
        }
        int middle = startIndex + (endIndex - startIndex) / 2;
        Comparable[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        Comparable[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        Comparable[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex)
        {
            result[destIndex++] = sorted1[index1].compareTo(sorted2[index2]) < 0 ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle)
        {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex)
        {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
