
package javaapplication2;


public class Palindrome {
   public static void main(String[] args){
       int sum = 0;
       int num = 121;
       int temp = num;
       while(temp!=0){
           int r = temp%10;
           sum = sum*10+r;
           temp = temp/10;
       }
       if(num==sum){
           System.out.println(num+" it's a palindrome.");
       }else{
           System.out.println(num+" it's not a palindrome.");
  
       }
   } 
}
