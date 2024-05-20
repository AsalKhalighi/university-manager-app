import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends User{
    // Properties
    String teacherName;
    String teacherSurname;

    String teacherID;
    List<Course> teacherCourses;


    // Constructor

    public Teacher(String name, String teacherSurname, int age, String teacherID, String email, String phoneNumber, String password) {
        super(name,teacherSurname, age);
        this.teacherCourses = new ArrayList<>();
        this.teacherID =teacherID;
        this.teacherCourses = new ArrayList<>();
    }

    // Methods
    public void addStudentToCourse(Student student, Course course) {
        course.addStudent(student);
    }

    public void removeStudentFromCourse(Student student, Course course) {
        course.removeStudent(student);
        System.out.println("student " + student.studentID + " has been removed." );
    }

    public void addProjectToCourse(Assignment project, Course course) {
        course.getProjects().add(project);
    }

    public void removeProjectFromCourse(Assignment project, Course course) {
        course.getProjects().remove(project);
    }

    public void assignGrade(Student student, Course course, double grade) {
        List<Student> students = course.getStudents();
        for (Student s : students) {
            if (s.equals(student)) {
                student.grade = grade;
                student.getGrades().add(grade);
                System.out.println("Grade assigned successfully to student " + student.getStudentID() + ": " + grade);
                System.out.println("Grades list for student " + student.getStudentID() + ": " + student.getGrades());
                return;
            }
        }
        System.out.println("Student not found in the course.");
    }

    public void setAssignmentDeadline(Course course, Assignment assignment, LocalDate deadline) {
        if (course.getTeacher().equals(this)) {
            assignment.setDeadline(deadline);
            System.out.println("Deadline for assignment " + assignment.getTitle() + " in course " + course.getName() + " is " + deadline);
        } else {
            System.out.println("Only the teacher of this course can set deadlines for assignments.");
        }
    }
}
