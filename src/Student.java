public class Student implements Serializable
{
    private String name;
    private String idNum;
    private double gpa;

    public Student(String n, String id, double gpaNum)
    {
        this.name = n;
        this.idNum = id;
        this.gpa = gpaNum;
    }

    public String getName()
    {
        return name;
    }

    public String getID()
    {
        return idNum;
    }

    public double getGPA()
    {
        return gpa;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setID(String id)
    {
        idNum = id;
    }

    public void setGPA(double gpaNum)
    {
        gpa = gpaNum;
    }

    public String toString()
    {
        return "Student: " + name + ", GPA: " + gpa + ", Student ID: " + idNum;
    }

    public String getSerialData()
    {
        return name + "," + idNum + "," + gpa;
    }
}
