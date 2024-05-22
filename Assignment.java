import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Assignment {
    // Properties
    Course course;
    LocalDate deadline;
    int daysLeft;
    String assignmentName;
    boolean isActive;


    // Constructor
    public Assignment(String assignmentName, Course course, LocalDate deadline) {
        this.assignmentName = assignmentName;
        this.daysLeft = (int) ChronoUnit.DAYS.between(LocalDate.now(), deadline) + 1;

    }

    // Methods
    public void changeDeadLine(LocalDate newDeadLine) {
        System.out.println("The deadline of \"" + this.assignmentName +  "\" has been changed to: " + newDeadLine);
        this.deadline = newDeadLine;
    }

    // Getters and Setters
    public void setActive(boolean active) {
        this.isActive = active;
    }

    public boolean isActive() {

        if(deadline.equals(LocalDate.now())){
            this.isActive = false;}
        else {this.isActive = true;}
        return isActive;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public String getTitle() {
        return assignmentName;
    }
}