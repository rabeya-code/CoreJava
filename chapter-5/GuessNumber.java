import java.util.Scanner;
public class GuessNumber{
	public static void main(String[] args){
		//generate a random number to be guessed
		int number = (int)(Math.random()*101);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please guess a magic number between 0 and 100");
		
		int guess = -1;
		while(guess != number){
			System.out.print("\n Enter your guess : ");
			guess = input.nextInt();
			
			if(guess==number)
				System.out.println("Yes , the number is " + number);
			else if (guess>number)
				System.out.println("Your number is too high");
			else
				System.out.println("Your number is too low");
		}
		
		
	}
}