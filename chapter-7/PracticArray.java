public class PracticArray{
	public static void main(String[] args){
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
			int odd=0;
			
		for(int i = 0; i<num.length; i++){
			if(num[i]%2!=0){
				odd=num[i];
				System.out.println(odd);
			}
			
		}
		
	}
}