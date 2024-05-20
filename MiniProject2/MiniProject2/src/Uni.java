import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uni {
    Scanner scanner = new Scanner(System.in);
    List<User> users = new ArrayList<>();
    List<Course> courses = new ArrayList<>();
    public void signup(){
        System.out.println("\n-----------------------");
        System.out.println("Please choose your role: ");
        System.out.println(" 1- Student");
        System.out.println(" 2- Teacher");
        System.out.println(" 3- Admin");
        int role = scanner.nextInt();
        switch (role){
            case 1:
            System.out.println("Please enter your name: ");
            String name = scanner.next();
            System.out.println("Please enter your surname: ");
            String surname = scanner.next();
            System.out.println("Please enter your age: ");
            int age = Integer.parseInt(scanner.next());
            System.out.println("Please enter your major: ");
            //برای این قسمت یه لیست درست کنیم از بین اونا انتخاب کنه؟
            String major = scanner.next();
            boolean check1 = false;
            String email = "";
            while (!check1){
                System.out.println("Please enter your email: ");
                email = scanner.next();
                check1 = emailValidator(email);
                if(!check1){
                System.out.println("YOUR EMAIL IS NOT VALID!");
                }

            }

                boolean check2 = false;
                String phoneNumber = "";
                while (!check2){
                    System.out.println("Please enter your phoneNumber: ");
                    phoneNumber = scanner.next();
                    check2 = phoneNumberValidator(phoneNumber);
                    if(!check2){
                        System.out.println("YOUR phoneNumber IS NOT VALID!");
                    }

                }

                boolean check3 = false;
                String password = "";
                while (!check3){
                    System.out.println("Please enter your password: ");
                    password = scanner.next();
                    check3 = passwordValidator(password);
                    if(!check3){
                        System.out.println("YOUR phoneNumber IS NOT VALID!");
                    }

                }

            String ID = generateStudentID();
            System.out.println("Your ID is: " + ID);

            Student student = new Student(name, surname, age, ID, major, email,phoneNumber, password);
            users.add(student);

            System.out.println("Signup was successful!");
            break;

            case 2:
                System.out.println("Please enter your name: ");
                String TeacherName = scanner.next();
                System.out.println("Please enter your surname: ");
                String teacherSurname = scanner.next();
                System.out.println("Please enter your age: ");
                int teacherAge = Integer.parseInt(scanner.next());
                boolean check11 = false;
                String teacherEmail = "";
                while (!check11){
                    System.out.println("Please enter your email: ");
                    teacherEmail = scanner.next();
                    check11 = emailValidator(teacherEmail);
                    if(!check11){
                        System.out.println("YOUR EMAIL IS NOT VALID!");
                    }

                }

                boolean check22 = false;
                String teacherPhoneNumber = "";
                while (!check22){
                    System.out.println("Please enter your phoneNumber: ");
                    teacherPhoneNumber = scanner.next();
                    check22 = phoneNumberValidator(teacherPhoneNumber);
                    if(!check22){
                        System.out.println("YOUR phoneNumber IS NOT VALID!");
                    }

                }

                boolean check33 = false;
                String teacherPassword = "";
                while (!check33){
                    System.out.println("Please enter your password: ");
                    teacherPassword = scanner.next();
                    check33 = passwordValidator(teacherPassword);
                    if(!check33){
                        System.out.println("YOUR phoneNumber IS NOT VALID!");
                    }

                }

                String teacherID = generateTeacherID();
                System.out.println("Your ID is: " + teacherID);
                Teacher teacher = new Teacher(TeacherName, teacherSurname, teacherAge, teacherID, teacherEmail,teacherPhoneNumber, teacherPassword);
                users.add(teacher);

                System.out.println("Signup was successful!");
                break;
        }



    }
    public void login(){

    }

    public static String generateStudentID(){
        String ID;
        ID = "110" + String.valueOf(Year.now()) + String.valueOf((int)(Math.random()*101)) ;
        return ID;
    }
    public String generateTeacherID(){
        String ID;
        ID = "220" + String.valueOf(Year.now()) + String.valueOf((int)(Math.random()*101)) ;
        return ID;
    }

    public boolean emailValidator(String email){
        //TODO
        return true;
    }
    public boolean phoneNumberValidator(String phoneNumber){
        //TODO
        return true;
    }
    public boolean passwordValidator(String password){
        //TODO
        //private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?!.*\\b\\w+\\b).{8,}$"
        return true;
    }


}
