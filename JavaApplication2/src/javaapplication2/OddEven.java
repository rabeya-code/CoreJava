
package javaapplication2;


public class OddEven {
  public static void main(String[] args){
      int[] nums = {2,5,6,3,8,10,47,83,44,94,11,33,56};
      int odd = nums[0];
      System.out.println("Odd numbers : ");
      for(int i = 0; i<nums.length; i++){
          if(nums[i]%2!=0){
              odd = nums[i];
              System.out.println(nums[i]);
          }
      }
      
      int even = nums[0];
      System.out.println("Even numbers : ");
      for(int i = 0; i<nums.length; i++){
          if(nums[i]%2==0){
              even = nums[i];
              System.out.println(nums[i]);
          }
      }
      
      
      
      
  }  
}
