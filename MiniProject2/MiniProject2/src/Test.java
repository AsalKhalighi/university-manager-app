import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Uni uni = new Uni();



        System.out.println("\n--------welcome--------");
        System.out.println("please choose your action: ");
        System.out.println(" 1- Login");
        System.out.println(" 2- Signup");



        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("ok");

                break;
            case 2:
                uni.signup();
                break;



        }




    }




}