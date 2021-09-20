
package classText1;
import java.util.Scanner;
public class PactorialNumber {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a factorial number : ");
      int num = input.nextInt();
      
      int fac = 1 ;
      if(num!=0){
      for(int i = 1; i<=num; i++ ){
            fac = fac * i;
      }
      
       System.out.println(num+" Factorial number is "+fac);
      }
  }  
}
