import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student extends User {
    // properties

    int courseNum = 0;
    String major;
    int vahedNum = 0;
    String email;
    String password;
    String phoneNumber;
    List<Course> courses = new ArrayList<>();
    double totalGradesAvg;
    String studentID;
    int term;
    int currentTerm;

    double grade;
    List<Double> grades = new ArrayList<>();


    // constructor
    public Student(String name, String surname, int age, String studentID, String major, String email, String phoneNumber, String password) {
        super(name , surname , age);
        this.studentID = studentID;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.totalGradesAvg = calculateTotalGradesAvg();

    }

    // methods
    public void addCourse(Course course) {
        this.courses.add(course);
        this.vahedNum += course.getVahed();
        this.courseNum++;
        course.addStudent(this);
    }
    public void removeCourse(Course course) {
        for(int i=0;i<courses.size();i++){
            if(this.courses.get(i).equals(course)){
                this.courses.remove(course);
                this.vahedNum -= course.getVahed();
                this.courseNum--;
                course.removeStudent(this);
                grades.remove(i);
            }
        }
    }

    public void printCourses() {
        System.out.println("Courses of student " + this.studentID + ": ");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    public void printTotalGradeAvg() {
        System.out.println("The total grade Avg for student " + this.studentID + " is " + this.calculateTotalGradesAvg());
    }

    public void printVahedNum() {
        System.out.println("Student with the ID " + this.studentID + " has " + this.vahedNum + " vahed.");
    }

    public double calculateTotalGradesAvg() {
        double total = 0.0;
        for (Double grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

/*    public double getGradeForCourse(Course course) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).equals(course)) {
                return grades.get(i);
            }
        }
        return 0.0;
    }*/




    // Getters and Setters
    public double getGrade() {
        return grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public double getTotalGradesAvg() {
        return totalGradesAvg;
    }


    public List<Double> getGrades(){return grades;}
}
