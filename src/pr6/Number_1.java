package pr6;
import pr6.MyInsertionSort;
import pr6.Student;
import java.util.Scanner;



public class Number_1

{

    public static void main(String[] args)

    {

        System.out.print("Введите количество студентов: ");

        Scanner in = new Scanner(System.in);

        Student[] iDNumber = new Student[in.nextInt()];

        for (int i = 0; i < iDNumber.length; ++i)

        {

            System.out.print("Введите id студента №" + (i + 1) + ": ");

            iDNumber[i] = new Student(in.nextInt());

        }

        for (Student student : iDNumber)
            System.out.print(student.getId() + " ");
        System.out.print('\n');
        MyInsertionSort.insertionSort(iDNumber);
        for (Student student : iDNumber)
            System.out.print(student.getId() + " ");
    }
}
