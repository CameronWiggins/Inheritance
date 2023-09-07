public class GradStudent extends Student 
{
    private int officeNum;
    private String officeHrs;

    public GradStudent(String n, String id, double gpaNum, int office, String hrs)
    {
        super(n, "GR-" + id, gpaNum);
        officeNum = office;
        officeHrs = hrs;

    }

    public int getOffice()
    {
        return officeNum;
    }

    public String getOfficeHrs()
    {
        return officeHrs;
    }

    public void setOffice(int num)
    {
        officeNum = num;
    }

    public void setOfficeHrs(String hrs)
    {
        officeHrs = hrs;
    }

    //@override wasn't working in class
    public void setID(String id)
    {
        super.setID("GR-" + id);
    }

    //@override wasn't working in class
    public String toString()
    {
        String begin = super.toString();
        return begin + ", Office: " + officeNum + ", Office Hours: " + officeHrs;
    }

    String getDegree()
    {
        return "graduate degree";
    }

}
