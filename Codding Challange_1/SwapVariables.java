import java.util.Scanner;
public class SwapVariables{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		/*System.out.println("Enter 1st number : ");
		int x = input.nextInt();
		
		System.out.println("Enter 2nd number : ");
		int y = input.nextInt();*/
		int x = 10 ;
		int y = 5 ;
		
		int tmp = x ;
		 x = y ;
		 y = tmp ;
		
		System.out.println("the 1st swap value  is : " +x);
		System.out.println("the 2nd swap value is : " +y);
	}
}