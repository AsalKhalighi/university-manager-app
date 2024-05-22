import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Uni uni = new Uni();
        boolean b = true;


        while(b){
            System.out.println("\n--------welcome--------");
            System.out.println("please choose your action: ");
            System.out.println(" 1- Login");
            System.out.println(" 2- Signup");
            System.out.println(" 3- Exit");




            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    uni.login();

                    b = false;
                    break;

                case 2:
                    uni.signup();
                    break;

                case 3:
                    b = false;
                    System.out.println("You've Exited Successfully!");
                    break;

                default:
                    System.out.println("Invalid choice");


            }
        }





    }




}