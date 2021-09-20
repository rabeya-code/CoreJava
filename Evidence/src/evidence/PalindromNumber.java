
package evidence;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        
        int sum = 0;
        int temp = num ;
        while(temp!=0){
            int rev = temp % 10;
            sum = sum*10 +rev;
            temp = temp/10;
        }
        if(num==sum){
            System.out.println(num+" it's Palindrom Number");
        }else{
             System.out.println(num+" it's not Palindrom Number");
        }
    }
  
}
