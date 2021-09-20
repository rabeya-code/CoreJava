public class AverageValueOfArray{        //qus:04
	public static void main(String[] args){
		int[] arrNumber = {2,4,6,8};
		
		int sumOfArr = 0 ;
	
		 
		for(int i=0; i<arrNumber.length; i++){
			sumOfArr += arrNumber[i]; 
		}
			int avgOfArr = sumOfArr/arrNumber.length;
	
		System.out.println("Average value of Array is : " + avgOfArr);
	}
}