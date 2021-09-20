import java.util.Scanner;
public class switchStatement{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//show the message for get information
		System.out.print("Please enter day number : ");
		
		
		//get input from user.
		int day = input.nextInt();
		
		/*switch(day){
			case 1:
			System.out.println("Sat day");
			break;
			case 2:
			System.out.println("Sun day");
			break;
			case 3:
			System.out.println("mon day");
			break;
			default:
			System.out.println("failed");
			
		}*/
		
		switch(day){
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			System.out.println(" weekday");
			break;
			case 1:
			case 7:
			System.out.println("weekendday");
			break;
			default:
			System.out.println("failed");
		}
		
		
		
		
		
	}
}



