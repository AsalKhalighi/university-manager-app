import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User extends JFrame{


    private String name;
    private String surname;
    private int age;


    User(String name,String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }



}

