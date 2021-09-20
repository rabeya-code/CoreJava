import java.util.Scanner;
public class PrintSum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 1st number : ");
		int num1 = input.nextInt();
		
		System.out.println("Please enter 2nd number : ");
		int num2 = input.nextInt();
		
		int num = num1 + num2 ;
		System.out.println("The sum of two number is : " +num);
	}
}