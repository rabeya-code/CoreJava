import java.util.Scanner;                 //qus:08
public class RemoveElement{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter specific value :");
		
		int value = input.nextInt();
		
		int[] arrNum = {2,5,3,65,8,4,9};
		
		System.out.println("array :"+arrNum);
		System.out.println("New array :");
		
		for(int i = 0; i<arrNum.length; i++){
			
			if(value!=arrNum[i]){
				System.out.println(arrNum[i]);
			
			}
		}
	}
}