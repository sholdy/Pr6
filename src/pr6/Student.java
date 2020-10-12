package pr6;
public class Student implements Comparable<Student>
{
    private final int id;
    private final float gpa;
    public Student(int id)
    {
        this.id = id;
        this.gpa = 0;
    }
    public Student(float gpa)
    {
        this.id = 0;
        this.gpa = gpa;
    }
    public int getId()
    {
        return id;
    }
    public float getGpa()
    {
        return gpa;
    }
    @Override
    public int compareTo(Student o)
    {
        return this.id - o.getId();
    }
    public Student makeCopy()
    {
        return new Student(id);
    }
}
