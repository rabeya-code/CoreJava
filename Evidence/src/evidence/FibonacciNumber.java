
package evidence;

import java.util.Scanner;


public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = input.nextInt();
        System.out.println("");
        int first = 0 ;
        int second = 1 ;
        int fibo;
        System.out.println("=========");
        System.out.println(first);
        System.out.println(second);
        
        for(int i=2; i<n; i++){
            fibo = first + second;
            System.out.println(fibo);
            
            first=second;
            second=fibo;
        }
    }
  
}
