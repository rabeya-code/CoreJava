public class SumationOfArray{         //qus:03
	public static void main(String[] args){
		int[] arrNum = {1,2,3,4,5,6,7,8,9};
		
		int arrSum = 0 ;
		
		for(int i = 0; i<arrNum.length; i++){
			arrSum = arrSum + arrNum[i];
		}
		System.out.println("The sum values of an array is : " +arrSum);
	}
}