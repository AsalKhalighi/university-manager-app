import java.util.ArrayList;
import java.util.List;

public class Course {
    String name;
    Teacher teacher;
    int tedadVahed;
    List<Student> students = new ArrayList<>();
    boolean isActive;
    int numberOfStudents;
    List<Assignment> assignments = new ArrayList<>();
    void printListOfStudents(){
        System.out.println(students);
    }
    void addingStudent(Student s){
        for(int i=0;i<students.size();i++){
            if(students.get(i) ==s){
                System.out.println("the student is already on the course");
                return;
            }
        }
        students.add(s);
        numberOfStudents++;
    }
    void deletingStudent(Student s){
        for(int i=0;i<students.size();i++){
            if(students.get(i) == s){
                students.remove(students.get(i));
                numberOfStudents--;
                return;
            }
        }
        System.out.println("the Student is not on the list");
    }
    double highestScore(){
        double max =0;
        for(int i=0;i<students.size();i++){
            for (int j=0;j<students.get(i).courses.size();j++){
                if(students.get(i).courses.get(j) == this){
                    max = Math.max(max,students.get(i).scores.get(j));
                }
            }
        }
        return max;
    }
    Teacher getTeacher(){
        return teacher;
    }

}
