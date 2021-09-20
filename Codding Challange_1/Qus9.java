import java.util.Scanner;
public class Qus9{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Type a text to get total index with space :");
		
		String text = input.nextLine();
		int totalIndex = text.length();
		System.out.println("Total Index with Space  : " + totalIndex);
	}
}