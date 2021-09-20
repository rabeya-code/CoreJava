
package javaapplication2;

import java.util.Arrays;

public class Multidimensional {
   public static void main(String[] args){
       int[][] numPattern = {{12,1,4,6,7},{2,4,57,8,6},{8,2,45,3,6}};
       
       for(int i = 0;i<numPattern.length; i++){
           Arrays.sort(numPattern[i]);
           for(int j=0; j<numPattern[i].length; j++){
               System.out.print(" "+numPattern[i][j]);
           }
           System.out.println();
       }
   } 
}
