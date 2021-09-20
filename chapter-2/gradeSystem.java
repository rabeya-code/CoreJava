import java.util.Scanner;
public class gradeSystem{
	public static viod main (String[] args){
	Scanner input = new Scanner(System.in);
	    System.out.println("Enter Your Bangla marks :");
	    int bangla = input.nextInt();
	
		System.out.println("Enter Your English marks :");
	    int English = input.nextInt();
	
		System.out.println("Enter Your Math marks :");
	    int Math = input.nextInt();
	
		System.out.println("Enter Your Islam marks :");
	    int Islam = input.nextInt();
		int avg = (bangla + English + Math + Islam )/4 ;
		System.out.println(avg);
		
		
		if (avg >= 80){
			System.out.println("A");
		}if else(avg >= 70){
			System.out.println("B");
		}if else(avg >= 60){
			System.out.println("C");
		}if else(avg >= 50){
			System.out.println("D");
		}else{
			System.out.println("F");
		}
 }
}
