import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Student {
    int numberOfCourses;
    int tedadVahed;
    List<Course> courses = new ArrayList<>();
    List<Double> scores = new ArrayList<>();
    double totalAverage;
    double termAverage;
    String studentId;
    void printTotalAverage(){
        System.out.println("total average is: "+totalAverage);
    }
    void printCourses(){
        System.out.println("list of courses is:\n "+courses);
    }
    void printTedadVahed(){
        System.out.println("number of vahed  is: "+tedadVahed);
    }
    void settingScores(){
        for (int i =0;i<courses.size();i++){
            scores.add(courses.get(i).getTeacher().nomredehi(this));
        }
    }
    void addingCourse(Course c){
        for(int i=0;i<courses.size();i++){
            if(c == courses.get(i)){
                System.out.println("this course is already on your list");
                return;
            }
        }
        courses.add(c);
        numberOfCourses++;
    }
    void deletingCourse(Course c){
        for(int i=0;i<courses.size();i++){
            if(courses.get(i) == c){
                courses.remove(c);
                numberOfCourses--;
                return;
            }
        }
        System.out.println("this course i not on your list");
    }



}
