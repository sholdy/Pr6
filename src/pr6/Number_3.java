package pr6;
import java.util.Scanner;
public class Number_3
{
    public static void main(String[] args)
    {
        System.out.print("Введите количество студентов в первом списке: ");
        Scanner in = new Scanner(System.in);
        Student[] students1 = new Student[in.nextInt()];
        for (int i = 0; i < students1.length; ++i)
        {
            System.out.print("Введите id студента №" + (i + 1) + ": ");
            students1[i] = new Student(in.nextInt());
        }
        System.out.print("Введите количество студентов в первом списке: ");
        Student[] students2 = new Student[in.nextInt()];
        for (int i = 0; i < students2.length; ++i)
        {
            System.out.print("Введите id студента №" + (i + 1) + ": ");
            students2[i] = new Student(in.nextInt());
        }
        System.out.print("Первый список: ");
        for (Student student : students1)
            System.out.print(student.getId() + " ");
        System.out.print('\n');
        System.out.print("Второй список: ");
        for (Student student : students2)
            System.out.print(student.getId() + " ");
        System.out.print('\n');
        Student[] students3 = (Student[]) MyMergeSort.mergeSort(students1, students2);
        System.out.print("Новый спиок: ");
        for (Student student : students3)
            System.out.print(student.getId() + " ");
    }
}
