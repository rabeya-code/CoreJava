import java.util.Scanner;
public class starPattarn{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter a pattern number :");
		int num = input.nextInt();
		/*
		for(int row = 0; row<num ; row++){
			for(int column = 0 ; column<=row ; column++){
				System.out.print("*");
			}
				System.out.println();
		}*/
		
		for(int row = 0 ; row<num ; row++){
			for(int column =(num-row); column>=0 ; column--){
				System.out.print(" ");
			}
			for( int column=0; column<=row; column++){
				System.out.print("*");
			}
			   System.out.println();
		}
		
		
		
		
		
	}
}