import java.util.Scanner;
public class practice{
	public static void main (String[] args){
		int num1 = (Int) (System.currentTimeMillis() % 10);
		int num2 = (Int) (System.currentTimeMillis()/7 %10);
		//CREATE A SCANNER
	    Scanner input = new Scanner(System.in);
		System.out.println("What is " + num1 + " + " + num2 + " ? ");
		int ans = input.nextInt();
		System.out.println(num1 + " + " num2 + " = " + ans + " is " +(num1 + num2 == ans));
		
	}
}