import java.util.Scanner;
public class DoWhileLoop{
	public static void main(String[] args){
		int data ; 
		int sum = 0 ;
		
		//create a Scanner
		Scanner input = new Scanner(System.in);
		//keep reading data util the input is 0
		do{
			//read the next data
			System.out.println("Enter an integer(the input endsif it is 0): ");
			data = input.nextInt();
			sum += data ;
			
			 
		} while(data != 0);
		System.out.println("The sum is "+ sum);
	}
}