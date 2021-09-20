import java.util.Scanner;
public class ReverseString{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter your name : ");
		String name = input.nextLine();
		
		for(int i = name.length()-1; i>=0 ; i--){
			System.out.print( name.charAt(i));
		}
	}
  }