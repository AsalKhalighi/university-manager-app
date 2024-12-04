import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class HomePage {

    private List<String> News = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    boolean logout = false;

    public  void loggedIn(User user){
        if(user instanceof Student){
            Student student = (Student) user;
            System.out.println("\n--------HomePage-------");
            System.out.println("please choose your page: ");
            System.out.println(" 1- User Information");
            System.out.println(" 2- Courses");
            System.out.println(" 3- Assignments");
            System.out.println(" 4- Exams");
            System.out.println(" 5- Grades");
            System.out.println(" 6- TODO");
            System.out.println(" 7- News");
            System.out.println(" 8- Log out");


            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    boolean back = false;
                    while (!back){
                        System.out.println("Name: "+student.getName());
                        System.out.println("Surname: "+student.getSurname());
                        System.out.println("Age: "+student.getAge());
                        System.out.println("Student ID: "+student.getID());
                        System.out.println("Major: "+student.getMajor());
                        System.out.println("Phone number: "+student.getPhoneNumber());
                        System.out.println("Email: "+student.getEmail());

                        System.out.println("\nFor editing your information please press '1' and for going back enter '2'");
                        int editingChoice =scanner.nextInt();
                        if(editingChoice==2){
                            back = true;
                            break;
                        }
                        else if (editingChoice == 1){
                            System.out.println("Choose what You want to change: " +
                                    "\n1.Name" +
                                    "\n2.surname" +
                                    "\n3.Age" +
                                    "\n4.Email" +
                                    "\n5.phone number" +
                                    "\n6.Back");
                            int edit = scanner.nextInt();
                            switch (edit){
                                case 1 :
                                    System.out.println("Please enter your name: ");
                                    String name = scanner.next();
                                    student.setName(name);
                                    System.out.println("Your name successfully changed to "+name);
                                    break;
                                case 2:
                                    System.out.println("Please Enter your surname: ");
                                    String surname = scanner.next();
                                    student.setSurnameName(surname);
                                    System.out.println("Your surname successfully changed to "+surname);
                                    break;
                                case 3:
                                    System.out.println("please enter your age: ");
                                    int age = scanner.nextInt();
                                    student.setAge(age);
                                    System.out.println("Your age successfully changed to "+age);
                                    break;
                                case 4:
                                    System.out.println("please enter your Email: ");
                                    String email = scanner.next();
                                    student.setEmail(email);
                                    System.out.println("your Email successfully changed to "+email);
                                    break;
                                case 5:
                                    System.out.println("Please Enter your phone number");
                                    String phoneNumber = scanner.next();
                                    student.setPhoneNumber(phoneNumber);
                                    System.out.println("your phone number successfully changed to "+phoneNumber);
                                    break;
                                case 6:
                                    break;
                            }
                        }
                    }
                    //1- show information
                    //2- edit information {ask what they wanna edit: 1-pass? 2-email? 3-...}

                    System.out.println();
                    break;
                case 2:
                    //show list of course with the teachers name and number of vahed
                    break;

                case 3:
                    //show the title of assignment and days left until deadline
                    break;
                case 4:
                    //show the coursename of the exam and deadline and details of the exam(boodjehbandi)
                    break;
                case 5:
                    //show a list of courses with their grades, the totalGradeAvg, the highest and the lowest grade
                    break;
                case 6:
                    //1- show to do list
                    //2- edit to do list
                    break;
                case 7:
                    //print news
                    for (String i : News) {
                        System.out.println(i);
                    }
                case 8:
                    logout = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        else if(user instanceof Teacher){
            Teacher teacher = (Teacher) user;
            System.out.println("\n--------HomePage-------");
            System.out.println("please choose your page: ");
            System.out.println(" 1- User Information");
            System.out.println(" 2- Courses");
            System.out.println(" 3- Assignments");
            System.out.println(" 4- Exams");
            System.out.println(" 5- Grades");
            System.out.println(" 6- TODO");
            System.out.println(" 7- News");
            System.out.println(" 8- Log out");

            int choice = scanner.nextInt();
            switch (choice) {

                case 1:
                    //1- show information
                    //2- edit information {ask what they wanna edit: 1-pass? 2-email? 3-...}

                case 2:


                case 3:

                case 4:

                case 5:

                case 6:

                case 7:

                case 8:
                    logout = true;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        else if(user instanceof Admin){
            Admin admin = (Admin) user;

            System.out.println("\n--------HomePage-------");
            System.out.println("please choose your page: ");
            System.out.println(" 1- User Information");
            System.out.println(" 2- Edit Information");
            System.out.println(" 3- Courses");
            System.out.println(" 4- Exams");
            System.out.println(" 5- Grades");
            System.out.println(" 6- TODO");
            System.out.println(" 7- News");
            System.out.println(" 8- Log out");

            int choice = scanner.nextInt();
            switch (choice) {

                case 1:
                    //1- show information
                    //2- edit information {ask what they wanna edit: 1-pass? 2-email? 3-...}

                case 2:


                case 3:

                case 4:

                case 5:

                case 6:

                case 7:

                    boolean back = false;
                    while(!back){
                    System.out.println("Please choose your action: ");
                    System.out.println(" 1- See News");
                    System.out.println(" 2- Add News");
                    System.out.println(" 3- Remove News");
                    System.out.println(" 4- Back");
                    int option = scanner.nextInt();
                    String text;

                    switch (option){

                        case 1:
                            for (String i : News) {
                                System.out.println(i);
                            }
                            break;
                        case 2:
                            System.out.println("Write down the News you want to add: ");
                            text = scanner.next();
                            admin.addNews(text);
                            System.out.println("News successfully updated!");
                            break;
                        case 3:
                            System.out.println("Write down the News you want to remove: ");
                            text = scanner.next();
                            admin.removeNews(text);
                            System.out.println("News successfully updated!");
                            break;

                        case 4:
                            back = true;
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }}

                case 8:
                    logout = true;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }





    }

    public List<String> getNews(){
        return this.News;
    }

}
