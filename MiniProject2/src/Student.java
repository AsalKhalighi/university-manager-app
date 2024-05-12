import java.util.ArrayList;
import java.util.List;

public class Student {
    // properties
    int courseNum = 0;
    int vahedNum = 0;
    List<Course> courses;
    double totalGradesAvg;
    int studentID;
    int term;
    int currentTerm;

    double grade;
    List<Double> grades;

    // constructor
    public Student(int studentID) {
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

    public double getGradeForCourse(Course course) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).equals(course)) {
                return grades.get(i);
            }
        }
        return 0.0;
    }


    // Getters and Setters
    public double getGrade() {
        return grade;
    }

    public int getStudentID() {
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
