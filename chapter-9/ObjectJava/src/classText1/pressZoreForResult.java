
package classText1;
import java.util.Scanner;
public class pressZoreForResult {
    public static void main(String[] agrs){
     Scanner input = new Scanner(System.in);
     System.out.println("Enter number(zero for stop)");
     int num = input.nextInt();
  
     int sum = 0 ;
  
     while(num!=0){
     if(num == -1){
      num = 0;     
     }
     sum+=num;
     System.out.println("sum = "+ sum +"|Enter a number to add");
     num = input.nextInt();
     if(num<0) break;
    
     }
     System.out.println("sum is "+sum);
    }  
}
