import java.util.Scanner;
public class SpecificArrayValue{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter specific value :");
		
		int value = input.nextInt();
		
		int[] arrNum = {2,5,3,65,8,4,9};
		
		for(int i = 0; i<arrNum.length; i++){
			
			if(value==i){
				System.out.println("Specific value is : " +arrNum[i]);
				break;
			}
		}
	}
}