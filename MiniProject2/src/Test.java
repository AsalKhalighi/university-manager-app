import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ali", "Ahmadi",1234);

        Course course = new Course("Math", teacher, 3);
        Course course2 = new Course("Geography", teacher, 2);
        Course course3 = new Course("Geo", teacher, 3);


        Student student1 = new Student(1);
        Student student2 = new Student(2);
        Student student3 = new Student(3);
        Student student4 = new Student(4);

        course3.addStudent(student1);
        course3.addStudent(student2);


        teacher.assignGrade(student1, course2, 80.0);
        teacher.assignGrade(student2, course2, 30.0);



        //Math : student1 ,student2
        //Geography: student1 ,student2 ,student3 ,student4
        student1.addCourse(course);
        student1.addCourse(course2);
        student2.addCourse(course);
        student2.addCourse(course2);
        student3.addCourse(course2);
        student4.addCourse(course2);







        teacher.assignGrade(student1, course, 90.0);
        teacher.assignGrade(student2,course,30.0);
        teacher.assignGrade(student3,course,50.0);

        teacher.removeStudentFromCourse(student1,course);
        System.out.println("****");





        double highestGrade = course.calculateHighestGrade();
        System.out.println("Highest grade in the Math course: " + highestGrade);




    }
}