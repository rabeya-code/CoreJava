
package evidence2;


public class MaxMin {
    public static void main(String[] args){
            int[] nums ={25,54,60,93,22,13,24,};
            int max = nums[0];
            for(int i =0 ;i<nums.length;i++){
                if(nums[i]>max){
                    max = nums[i];
                }
                
            }
            System.out.println("Max number is "+max);
            
            
            int min = nums[0];
            for(int i = 0; i<nums.length;i++){
               if(nums[i]<min){
                    min = nums[i];
                }
            }
            System.out.println("Min number is "+min);
            
            int odd = nums[0];
            for(int i = 0;i<nums.length;i++){
                if(nums[i]%2!=0){
                  odd = nums[i]; 
                  System.out.println(nums[i]);
                }
                
            }
                        

    }
}
