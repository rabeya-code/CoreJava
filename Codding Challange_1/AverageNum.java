import java.util.Scanner;
public class AverageNum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int num1 = input.nextInt();
		
		System.out.println("Enter second number : ");
		int num2 = input.nextInt();
		
		System.out.println("Enter thrid number : ");
		int num3 = input.nextInt();
		
		int averageNum = (num1+num2+num3)/3 ;
		System.out.println("Average Number is : "+averageNum);
	}
}