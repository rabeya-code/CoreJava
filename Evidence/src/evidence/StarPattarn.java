
package evidence;

import java.util.Scanner;


public class StarPattarn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Pattarn number : ");
        int num = input.nextInt();
        for(int row=0; row<num; row++){
            for(int column=0; column<=row; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
 
}
