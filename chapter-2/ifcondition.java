import java.util.Scanner;
public class ifcondition{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter  value :");
			int num = input.nextInt();
		if(num>0){
			System.out.println(num + " > 0 True");
		}
			
		if else(num<0){
			System.out.println(num + " < 0 False");	
		}
		
		if else(num!=0){
		System.out.println(num + " != 0 True");	
		}	
		
		if else(num>=0){
		System.out.println(num + " >= 0 True");	
		}
			
		if else(num!=1){
		System.out.println(num + " != 1 False");	
		}
			
	}
	
}