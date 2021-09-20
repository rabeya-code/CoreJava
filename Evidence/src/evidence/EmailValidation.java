
package evidence;

import java.util.Scanner;


public class EmailValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email address please :");
        String email = input.nextLine();
        String regex = "^[A-Za-z-0-9+_.-]+@(.+)$";
        
        if(email.matches(regex)){
            System.out.println("Valid mail.");
        }else{
            System.out.println("Invalid mail.");
        }
    }
   
}
