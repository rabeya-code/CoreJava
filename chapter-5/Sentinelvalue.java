import java.util.Scanner;
public class Sentinelvalue{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//read a initial data
		System.out.println("Enter an integer(the input ends if it is 0): ");
		int data = input.nextInt();
		
		//keep reading data unit the input is 0
		int sum = 0 ;
		while(data != 0){
			sum +=data;
			
			//reat the next data
			System.out.println("Enter an integer (the input ends if it is 0) : ");
			data = input.nextInt();
			
		}
		System.out.println("The sum is "+sum);
	}
}