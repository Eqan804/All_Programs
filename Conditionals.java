import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        // Conditionals two types first (if), (else) let's goooo
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = scan.nextInt();

                // if
        /*
         This  use if your 4 se kam hai to app kid ho
         But else mean and big to this age to you not a kid 
         */
        if(age>20){
            System.out.println("You are an adult");
        }
        else if (age>5) {

            System.out.println("Your are not a kid");
        }
        else{
            System.out.println("You are a kid"); }
        }
    }