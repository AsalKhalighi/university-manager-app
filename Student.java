import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student extends User {
    // properties

    private int courseNum = 0;
    private String major;
    private int vahedNum = 0;
    private String email;
    private String password;
    private String phoneNumber;
    private List<Course> courses = new ArrayList<>();
    private double totalGradesAvg;
    private String studentID;
    private int term;
    private int currentTerm;
    Uni uni = new Uni();




    // constructor
    public Student(String name, String surname, int age, String studentID, String major, String email, String phoneNumber, String password) {
        super(name , surname , age,studentID,phoneNumber,email);
        this.studentID = studentID;
        this.courses = new ArrayList<>();
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
                courses.get(i).getGrades().remove(courses.get(i).getGrades().get(i));
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
        int totalGradesCount = 0;

        for (Course course : courses) {
            for (Double grade : course.getGrades()) {
                total += grade;
                totalGradesCount++;
            }
        }
        if (totalGradesCount > 0) {
            return total / totalGradesCount;
        } else {
            return 0.0;
        }
    }





    // Getters and Setters


    public List<Course> getCourses() {
        return courses;
    }

    public double getTotalGradesAvg() {
        return totalGradesAvg;
    }
    public String getMajor(){
        return this.major;
    }
    public String getStudentID(){
        return this.studentID;
    }
    public void setPassword(String password){
        while (this.password.equals(password)){
            System.out.println("YOUR PASS CANT BE THE SAME! Please Enter a new Password");
            password = scanner.next();

        }
        while (!uni.passwordValidator(password)){
            System.out.println("YOUR PASSWORD IS NOT VALID!");
            password = scanner.next();
        }
        this.password = password;

    }


    public int getTerm(){
        return this.term;
    }
    public int getVahedNum(){
        return this.vahedNum;
    }
    public void setMajor(String major){
        this.major = major;
    }





    public Map<Course, List<Double>> getCourseGrades() {
        Map<Course, List<Double>> courseGrades = new HashMap<>();
        for (Course course : courses) {
            courseGrades.put(course, course.getGrades());
        }
        return courseGrades;
    }
}
