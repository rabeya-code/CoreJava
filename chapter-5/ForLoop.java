import java.util.Scanner;
public class ForLoop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		 int sum = 0 ;
		for(int i = 0 ; i < 5 ; i++){
			System.out.println("Please Enter a number : ");
			int number  = input.nextInt();
			sum += number ;
		}
		System.out.println("Sum is "+ sum);

	}
}