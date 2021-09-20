import java.util.Scanner;
public class OrderTwoCities{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//show message for get information from user
		System.out.println("Enter the first city : ");
		
		//get input from user
		String city1 = input.nextLine();
		
		//show message for get information from user
		System.out.println("Enter the second city : ");
		
		//get input from user
		String city2 = input.nextLine();
		
		System.out.println(city1.compareTo(city2));
		
		//if(city1.compareTo(city2)<0){
		//	System.out.println("The cities in alphabetical order are "+ city1 +" "+ city2);
		//}
		//else{
//System.out.println("The cities in alphabetical order are "+ city2 +" "+ city1);
		//}
	}
}