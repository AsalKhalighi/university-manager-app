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
    private String email;
    private String phoneNumber;
    Uni uni = new Uni();
    Scanner scanner = new Scanner(System.in);



    User(String name,String surname, int age, String ID,String phoneNumber,String email){
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email =email;
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
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        while (!uni.emailValidator(phoneNumber)){
            System.out.println("Please enter a valid phone number!");
            phoneNumber = scanner.next();
        }
        this.phoneNumber = phoneNumber;

    }
    public void setEmail(String email){
        while (!uni.emailValidator(email)){
            System.out.println("Please enter a valid email!");
            email = scanner.next();
        }
        this.email = email;

    }




}

