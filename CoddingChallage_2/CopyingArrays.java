import java.util.Arrays;
public class CopyingArrays{                         //qus :09
	public static void main(String[] args){
		int[] sourceArray = {7,2,5,10,8};
		int[] targetArray = new int[sourceArray.length];
		
		System.out.print("Current Array "); 
		System.out.println(Arrays.toString(sourceArray)); 
		
		
		
		for(int i = 0; i<sourceArray.length; i++){
			targetArray[i] = sourceArray[i];
			
		}
		    System.out.print("New Array ");
			System.out.println(Arrays.toString(targetArray));
	}
}