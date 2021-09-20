import java.util.Scanner;
public class UnicodePrint{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please put a text : ");
		String text = input.nextLine();
		
		for(int i=0; i<text.length(); i++){
			System.out.print(text.charAt(i) + " = ");
			System.out.println(text.codePointAt(i));
		}
		
	}
}