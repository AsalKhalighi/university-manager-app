import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Teacher {
    String name;
    int numberOfCourses;
    List<Course> courses;
     double nomredehi(Student s){
         Scanner scanner = new Scanner(System.in);
         System.out.println("please enter student score: ");
         return scanner.nextDouble();
    }
    void deletingStudentFromCourse(Course c,Student s){
         for(int i=0;i<s.courses.size();i++){
             if(s.courses.get(i) == c){
                 c.students.remove(s);
                 c.numberOfStudents--;
                 s.courses.remove(i);
                 s.scores.remove(i);
                 s.numberOfCourses--;
                 return;
             }
         }
        System.out.println("this student is not on the course list");
    }
    void addingStudentToCourse(Course c,Student s){
         for (int i=0;i<s.courses.size();i++){
             if(s.courses.get(i) ==c){
                 System.out.println("this student is already on this course");
                 return;
             }
         }
         c.students.add(s);
         c.numberOfStudents++;
         s.courses.add(c);
         s.numberOfCourses++;
         s.scores.add(0.0);
    }
    void addingAssignment(Course c,String name, LocalDate deadLine){
         Assignment a = new Assignment(name,deadLine,true);
         a.isActive = true;
         c.assignments.add(a);
    }
    void deletingAssignment(Course c,Assignment a){
         c.assignments.remove(a);
    }




}
