import java.util.Scanner;
public class RepeatAdditionQuize{
	public static void main(String[] args){
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		//create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.println("What is "+number1+"+"+number2+"?");
		
		int answer = input.nextInt();
		
		while(number1 + number2 != answer){
			System.out.println("Wrong answer . try again . what is " + number1 +"+"+ number2 + "="+"?");
			answer = input.nextInt();
		}
		System.out.print("You got it !");
		
	}
}