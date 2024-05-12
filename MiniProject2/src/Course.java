import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course {
    // Properties
    private String courseName;
    private Teacher courseTeacher;
    private int vahed;
    List<Student> students;
    Boolean isActive;
    List<Assignment> assignments;
    List<Assignment> projects;
    private LocalDate examDate;
    private int studentsNum = 0;
    private int term;
    private double highestGrade;

    double grade;

    // Constructor
    public Course(String courseName, Teacher teacher, int vahedNum) {
        this.courseName = courseName;
        this.courseTeacher = teacher;
        this.vahed = vahedNum;
        this.students = new ArrayList<>();
        this.isActive = true;
        this.assignments = new ArrayList<>();
        this.projects = new ArrayList<>();
    }

    // Methods
    public void printStudents() {
        System.out.println("List of students of course \"" + this.courseName + "\": ");
        for (Student student : this.students) {
            System.out.println("Student ID for this course: " + student.studentID);
        }
    }

   public void addStudent(Student student) {
        this.students.add(student);
        this.studentsNum++;
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
        this.studentsNum--;
    }

    public double calculateHighestGrade() {
        if (students.isEmpty()) {
            return 0.0;
        }
        double highestGrade = 0.0;
        for (Student student : students) {
            double studentGrade = student.getGradeForCourse(this);
            if (studentGrade > highestGrade) {
                highestGrade = studentGrade;
            }}
        return highestGrade;
        }

    public void printProjects(){
        for(Assignment project : this.projects){
        System.out.println("the project of course " + this.courseName + " is " +project.assignmentName);
        }}

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public Teacher getCourseTeacher() {
        return courseTeacher;
    }

    public int getVahed() {
        return vahed;
    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean isActive() {
        return isActive;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public int getStudentsNum() {
        return studentsNum;
    }

    public List<Assignment> getProjects() {
        return projects;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }

    public double getHighestGrade() {
        return highestGrade;
    }

    public int getTerm() {
        return term;
    }

    public Teacher getTeacher() {
        return courseTeacher;
    }

    public String getName() {
        return courseName;
    }

    public double getGrade(){
        return grade;
    }


}