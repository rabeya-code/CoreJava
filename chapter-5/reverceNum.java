import java.util.Scanner;
public class reverceNum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		    int	digit1 = num /10 ;  
			int digit2 = num %10 ;
			
			int fnum = (digit2*10)+digit1;
			System.out.println(fnum);
	}
}