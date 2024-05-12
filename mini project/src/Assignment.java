import java.time.Duration;
import java.time.LocalDate;

public class Assignment {
    Course course;
    boolean isActive;
    LocalDate now = LocalDate.now();
    LocalDate deadLine;
    Assignment(String name,LocalDate deadLine,boolean isActive){
        this.deadLine = deadLine;
        this.isActive = isActive;
    }
    void setDeadLine(LocalDate deadLine){
        this.deadLine = deadLine;
    }
//    long remainingDays = Duration.between(now,deadLine).toDays();
//    void setActive(){
//        if(remainingDays>0){
//            isActive = true;
//        }
//        else isActive = false;
//    }




}
