import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Kelsey Omaro", "11563", 3.854);
        Student s2 = new Student("Jeff Reidus", "99872", 2.731);
        GradStudent gs1 = new GradStudent("Margie Neff", "12009", 4.0, 122, "8:00 - 2:00");
        GradStudent gs2 = new GradStudent("Nathan Kelly", "77743", 3.918, 213, "12:00 - 6:00");

        s2.setGPA(3.533);
        gs1.setName("Margie Olson");
        
        ArrayList<Student> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(gs1);
        list.add(gs2);

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }




    }
}
