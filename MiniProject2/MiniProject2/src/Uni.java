import java.time.Year;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uni {
    Scanner scanner = new Scanner(System.in);
    static List<User> users = new ArrayList<>();
    List<Course> courses = new ArrayList<>();
    List<String> passwords = new ArrayList<>();
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";
    private static final String PHONENUMBER_REGEX = "^(09)[0-9]{9}$";
    public void signup(){
        System.out.println("\n-----------------------");
        System.out.println("Please choose your role: ");
        System.out.println(" 1- Student");
        System.out.println(" 2- Teacher");
        System.out.println(" 3- Admin");
        int role = scanner.nextInt();
        System.out.println("\n-----------------------");
        switch (role){
            case 1:
                System.out.println("Please enter your name: ");
                String name = scanner.next();
                System.out.println("Please enter your surname: ");
                String surname = scanner.next();
                System.out.println("Please enter your age: ");
                int age = Integer.parseInt(scanner.next());
                System.out.println("Please choose your major: ");

                Map<Integer, String> majors = new HashMap<>();

                majors.put(1, "Anthropology");
                majors.put(2, "Biology");
                majors.put(3, "Business Administration");
                majors.put(4, "Chemistry");
                majors.put(5, "Computer Science");
                majors.put(6, "Economics");
                majors.put(7, "Education");
                majors.put(8, "Engineering (various disciplines like Civil, Mechanical, Electrical, etc.)");
                majors.put(9, "English Literature");
                majors.put(10, "Environmental Science");
                majors.put(11, "History");
                majors.put(12, "Mathematics");
                majors.put(13, "Nursing");
                majors.put(14, "Philosophy");
                majors.put(15, "Physics");
                majors.put(16, "Political Science");
                majors.put(17, "Psychology");
                majors.put(18, "Sociology");
                majors.put(19, "Visual Arts");
                majors.put(20, "World Languages and Cultures");

                for (Map.Entry<Integer, String> entry : majors.entrySet()) {
                    System.out.println(entry.getKey() + "- " + entry.getValue());
                }

                int input = scanner.nextInt();
                System.out.println(majors.get(input));

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
                    passwords.add(password);
                    check3 = passwordValidator(password);
                    if(!check3){
                        System.out.println("YOUR PASSWORD IS NOT VALID!");
                    }

                }

                String ID = generateStudentID();
                System.out.println("Your ID is: " + ID);

                Student student = new Student(name, surname, age, ID, majors.get(input), email,phoneNumber, password);
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
                        System.out.println("YOUR PHONENUMBER IS NOT VALID!");
                    }

                }

                boolean check33 = false;
                String teacherPassword = "";
                while (!check33){
                    System.out.println("Please enter your password: ");
                    teacherPassword = scanner.next();
                    passwords.add(teacherPassword);
                    check33 = passwordValidator(teacherPassword);
                    if(!check33){
                        System.out.println("YOUR PASSWORD IS NOT VALID!");
                    }

                }

                String teacherID = generateTeacherID();
                System.out.println("Your ID is: " + teacherID);
                Teacher teacher = new Teacher(TeacherName, teacherSurname, teacherAge, teacherID, teacherEmail,teacherPhoneNumber, teacherPassword);
                users.add(teacher);

                System.out.println("Signup was successful!");
                break;

            case 3:
                System.out.println("Please enter your name: ");
                String AdminName = scanner.next();
                System.out.println("Please enter your surname: ");
                String AdminSurname = scanner.next();
                System.out.println("Please enter your age: ");
                int AdminAge = Integer.parseInt(scanner.next());
                boolean check111 = false;
                String AdminEmail = "";
                while (!check111){
                    System.out.println("Please enter your email: ");
                    AdminEmail = scanner.next();
                    check111 = emailValidator(AdminEmail);
                    if(!check111){
                        System.out.println("YOUR EMAIL IS NOT VALID!");
                    }

                }

                boolean check222 = false;
                String AdminPhoneNumber = "";
                while (!check222){
                    System.out.println("Please enter your phoneNumber: ");
                    AdminPhoneNumber = scanner.next();
                    check222 = phoneNumberValidator(AdminPhoneNumber);
                    if(!check222){
                        System.out.println("YOUR PHONENUMBER IS NOT VALID!");
                    }

                }

                boolean check333 = false;
                String AdminPassword = "";
                while (!check333){
                    System.out.println("Please enter your password: ");
                    AdminPassword = scanner.next();
                    passwords.add(AdminPassword);
                    check333 = passwordValidator(AdminPassword);
                    if(!check333){
                        System.out.println("YOUR PASSWORD IS NOT VALID!");
                    }

                }

                String adminValidId = "3301000100";
                String adminID ="";
                boolean x = false;
                System.out.println("Please enter your ID: ");
                adminID = scanner.next();

                if (adminID.equals(adminValidId.trim())) {
                    x = true;
                    Admin admin = new Admin(AdminName, AdminSurname, AdminAge, adminID, AdminEmail,AdminPhoneNumber, AdminPassword);
                    users.add(admin);
                    System.out.println("Signup was successful!");
                    break;
                } if(!x) {
                    System.out.println("The ID You Entered Is Not Valid");
                }


                break;

            default:
                System.out.println("Invalid choice");
        }



    }
    public void login() {
        boolean foundUser = false;
        boolean correctpass = false;
        boolean logoutChoice = false;
        int num = 0;
        while (!foundUser) {
            System.out.println("Please Enter your ID: ");
            String enteredID = scanner.next();
            for (int m = 0; m < users.size(); m++) {
                if (users.get(m).getID().equals(enteredID)) {
                    num = m;
                    foundUser = true;
                    break;
                }
            }
            if (!foundUser) {
                System.out.println("user not found.");
            }
        }
        while (!correctpass) {
            System.out.println("Enter your Password: ");
            String enteredPass = scanner.next();
            if (passwords.get(num).equals(enteredPass)) {
                System.out.println("Login successful!");
                System.out.println("Welcome " + users.get(num).getName() + " " + users.get(num).getSurname());
                correctpass = true;
                HomePage homePage = new HomePage();
                homePage.loggedIn(users.get(num));
                if(homePage.logout){
                    logoutChoice = true;
                    break;
                }



            }
            if (!correctpass) {
                System.out.println("your password is not correct!");
            }

        }
    }
    public static boolean duplicateID(String ID2) {
        for (User user : users){
            if(user.getID().equals(ID2)){
                return true;
            }
        }
        return false;

    }


    public static String generateStudentID () {
        String part1 ="110" + String.valueOf(Year.now());
        StringBuilder part2 = new StringBuilder(String.valueOf((int) (Math.random() * 101)));
        while (part2.length()<3){
            part2.insert(0, "0");
        }
        String ID = part1+part2;
        while (duplicateID(ID)){
            ID ="110" + String.valueOf(Year.now()) + String.valueOf((int) (Math.random() * 101));
        }
        return ID;
    }
    public String generateTeacherID () {
        String part1 ="110" + String.valueOf(Year.now());
        StringBuilder part2 = new StringBuilder(String.valueOf((int) (Math.random() * 101)));
        while (part2.length()<3){
            part2.insert(0, "0");
        }
        String ID = part1+part2;
        ID = "220" + String.valueOf(Year.now()) + String.valueOf((int) (Math.random() * 101));
        while (duplicateID(ID)){
            ID ="220" + String.valueOf(Year.now()) + String.valueOf((int) (Math.random() * 101));
        }

        return ID;
    }

    public boolean emailValidator (String email){
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public boolean phoneNumberValidator (String phoneNumber){
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    public boolean passwordValidator (String password){
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }





}




