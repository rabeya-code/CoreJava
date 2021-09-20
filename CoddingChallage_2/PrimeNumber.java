public class PrimeNumber{
	public static void main(String[] args){
		int[] arrNum = {1,2,3,4,56,7,5};
		
			
		for(int i=2; i<arrNum.length;i++){
			if(arrNum[i]%i==0){
				System.out.println("prime munber are : " +i);
			}
		}
		
	}
}