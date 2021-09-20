import java.util.Scanner;                                 //page-134
public class ComparingString{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
			//show message for get information from user.
		System.out.println("Please Enter Your  Name :");
		
		//get input from user.
		String name1 = input.nextLine();
		
		//show message for get information from user.
		//System.out.println("Please Enter Your confermation Name :");
		
		//get input from user.
		String name2 = name1 ;
		
		
		if(name1==name2)
		   System.out.println("Match");
		else
	       System.out.println("No Match");
		
	}
}