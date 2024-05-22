import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Teacher extends User{
    // Properties
    private String teacherName;
    private String teacherSurname;
    private String password;
    private String teacherEmail;
    private String phoneNumber;

    private List<Course> teacherCourses;
    Uni uni = new Uni();


    // Constructor

    public Teacher(String name, String teacherSurname, int age, String teacherID, String email, String phoneNumber, String password) {
        super(name,teacherSurname, age, teacherID,phoneNumber,email);
        this.teacherCourses = new ArrayList<>();
        this.teacherCourses = new ArrayList<>();
    }

    // Methods
    public void addStudentToCourse(Student student, Course course) {
        course.addStudent(student);
    }

    public void removeStudentFromCourse(Student student, Course course) {
        course.removeStudent(student);
        System.out.println("student " + student.getID() + " has been removed." );
    }

    public void addProjectToCourse(Assignment project, Course course) {
        course.getProjects().add(project);
    }

    public void removeProjectFromCourse(Assignment project, Course course) {
        course.getProjects().remove(project);
    }

    public void assignGradeToStudent(Student student, Course course, double grade) {
        if (course.getStudents().contains(student)) {
            Map<Course, List<Double>> studentGrades = student.getCourseGrades();
            if (studentGrades.containsKey(course)) {
                studentGrades.get(course).add(grade);
            } else {
                List<Double> grades = new ArrayList<>();
                grades.add(grade);
                studentGrades.put(course, grades);
            }
            System.out.println("Grade assigned successfully to student " + student.getID() + " for course " + course.getCourseName() + ": " + grade);
        } else {
            System.out.println("Student " + student.getID() + " is not enrolled in course " + course.getCourseName());
        }
    }


    public void setAssignmentDeadline(Course course, Assignment assignment, LocalDate deadline) {
        if (course.getTeacher().equals(this)) {
            assignment.setDeadline(deadline);
            System.out.println("Deadline for assignment " + assignment.getTitle() + " in course " + course.getName() + " is " + deadline);
        } else {
            System.out.println("Only the teacher of this course can set deadlines for assignments.");
        }
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
    public String getTeacherEmail(){
        return this.teacherEmail;
    }


}
