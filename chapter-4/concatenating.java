import java.util.Scanner;
public class concatenating{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//show message for get information from user.
		System.out.println("Please Enter Your Frist Name :");
		
		//get input from user.
		String fristName = input.nextLine();
		
		//show message for get information from user.
		System.out.println("Please Enter Your Last Name :");
		
		//get input from user.
		String lastName = input.nextLine();
		
		System.out.println("Full name is : " + (fristName.concat(lastName)));
	}
	
	
}