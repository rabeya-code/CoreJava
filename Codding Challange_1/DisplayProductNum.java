import java.util.Scanner;
public class DisplayProductNum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input 1st number : ");
		int num1 = input.nextInt();
		
		System.out.println("Please input 2nd number : ");
		int num2 = input.nextInt();
		
		int num = num1 * num2 ;
		System.out.println("The product of two numbers are : "+num1+" * "+num2+" = " +num);
	}
}