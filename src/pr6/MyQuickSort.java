package pr6;
import java.util.Comparator;
public class MyQuickSort
{
    public static void quickSort(Comparable[] list, Comparator comp, int low, int high)
    {
        if (list.length == 0)
            return;//завершить выполнение, если длина массива равна 0
        if (low >= high)
            return;//завершить выполнение если уже нечего делить
        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        Comparable support = list[middle];
        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j)
        {
            while (comp.compare(list[i], support) == -1)
                ++i;
            while (comp.compare(list[j], support) == 1)
                --j;
            if (i <= j)
            {
                //меняем местами
                Comparable temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                ++i;
                --j;
            }
        }
        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(list, comp, low, j);
        if (high > i)
            quickSort(list, comp, i, high);
    }
}
