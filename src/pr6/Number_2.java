package pr6;
import java.util.Scanner;
public class Number_2
{
    public static void main(String[] args)
    {
        System.out.print("Введите количество студентов: ");
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[in.nextInt()];
        for (int i = 0; i < students.length; ++i)
        {
            System.out.print("Введите GPA студента №" + (i + 1) + ": ");
            students[i] = new Student(in.nextFloat());
        }
        for (Student student : students)
            System.out.print(student.getGpa() + " ");
        System.out.print('\n');
        SortingStudentsByGPA comp = new SortingStudentsByGPA();
        MyQuickSort.quickSort(students, comp, 0, students.length - 1);
        for (Student student : students)
            System.out.print(student.getGpa() + " ");
    }
}
