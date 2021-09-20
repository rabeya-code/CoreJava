import java.util.Arrays;        //qus : 10
public class MaxMinArray{
	public static void main(String[] args){
		int[] arrNum = {10,30,67,25,5,47}; 
		  Arrays.sort(arrNum);
		  
		   int min = arrNum[0];
		   System.out.println("Min valus is "+min);
		   
		   
		   int max = arrNum[arrNum.length-1];
		   System.out.println("Max valus is "+max);
	}
}