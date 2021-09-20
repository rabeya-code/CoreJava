import java.util.Scanner;
public class MathClass{
	public static void main(String[] agrs){
		Scanner input = new Scanner(System.in);
		
		//show message for get informatoin from user.
		System.out.println("Please Enter base number :");
		
		//get input from user.
		double a = input.nextDouble();
		
		//show message for get informatoin from user.
		//System.out.println("Please Enter power number :");
		
		//get input from user.
		//double b = input.nextDouble();
		
		//System.out.println(Math.pow(a, b));
		System.out.println(Math.sqrt(a));
		
	}
}