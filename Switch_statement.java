import java.util.Scanner;

public class Switch_statement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = scan.nextInt();
         // You must declare and assign age

switch (age) {
    case 12:
        System.out.println("You are 12 years old");
        break;
    case 56:
        System.out.println("You are 56 years old");
        break;
    case 16:
        System.out.println("You are 16 years old");
        break;
    default:
        System.out.println("You did not match any of the cases");
}

        }
            
    }
