
package practiceathome;

import java.util.Scanner;


public class EmailValid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your email address : ");
        String email = input.nextLine();
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        if(email.matches(regex)){
            System.out.println("Valid mail");
        }else{
            System.out.println("Invalid mail");
        }
    }
}
