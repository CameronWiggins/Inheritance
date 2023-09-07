public class UnderGradStudent extends Student
{

    public UnderGradStudent(String n, String id, double gpaNum)
    {
        super(n, "GR-" + id, gpaNum);
    }
    String getDegree()
    {
        return "2 or 4 year degree";
    }
}