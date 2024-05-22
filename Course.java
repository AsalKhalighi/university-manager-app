import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course {
    // Properties
    private String courseName;
    private Teacher courseTeacher;
    private String courseID;
    private int vahed;
    List<Student> students;
    Boolean isActive;
    List<Assignment> assignments;
    List<Assignment> projects;
    private LocalDate examDate;
    private String examDetail;
    private int studentsNum = 0;
    private int term;
    private double highestGrade;
    double grade;
    List<Double> grades = new ArrayList<>();



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
            System.out.println("Student ID for this course: " + student.getID());
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

    public double calculateHighestGradeINCourse() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double highestGrade = grades.get(0);
        for (Double grade : grades) {
            if (grade > highestGrade) {
                highestGrade = grade;
            }
        }
        return highestGrade;
    }


    public double calculateLowestScoreInCourse() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double lowestGrade = grades.get(0);
        for (Double grade : grades) {
            if (grade < lowestGrade) {
                lowestGrade = grade;
            }
        }
        return lowestGrade;
    }


    public double calculateTotalGradesAvgInCourse() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double totalGrades = 0.0;
        for (Double grade : grades) {
            totalGrades += grade;
        }
        return totalGrades / grades.size();
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
    public List<Double> getGrades(){
        return this.grades;
    }




}