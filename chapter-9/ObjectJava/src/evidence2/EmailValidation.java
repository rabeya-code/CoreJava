package evidence2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Email");
        String email = input.nextLine();

        //String email = "Rabu@Bibi";
        System.out.println("Your Email is :" + validEmail(email));

    }

    public static String validEmail(String email) {
        if (email == null || email.isEmpty()) {
            return "Invalid";
        }
        String rex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(rex);
        if (pattern.matcher(email).matches()) {
            return "Valid Email";
        } else {
            return "Invalid Email";
        }
    }
}
