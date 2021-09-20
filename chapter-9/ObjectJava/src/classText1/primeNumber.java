
package classText1;

 import java.util.Scanner;
public class primeNumber {
      public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer : ");
        int num = input.nextInt();
       
        int count = 0;
        for(int i=2; i<num;i++){
            if(num%i==0){
                count++;
                break;
              }
            
            }
            if(count==0){
                System.out.println("It's  prime number");
            }else{
                 System.out.println("It's not prime number");
            }
    }
}
