import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Teacher t1 =new Teacher();
        Course c1 = new Course();
        Course c2 = new Course();

        Assignment a1 = new Assignment("first", LocalDate.of(2024,12,27),true);
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3= new Student();
        Student s4 =new Student();
        Student s5 = new Student();
        Student s6 = new Student();

        t1.addingStudentToCourse(c1,s1);


    }
}