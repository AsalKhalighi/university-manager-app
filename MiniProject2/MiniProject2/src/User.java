import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User{


    private String name;
    private String surname;
    private int age;
    private String ID;
    Scanner scanner = new Scanner(System.in);



    User(String name,String surname, int age, String ID){
        this.ID = ID;
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

    public String getID(){
        return this.ID;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurnameName(String name){
        this.surname= name;
    }
    public void setAge(int Age){
        this.age = Age;
    }




}

