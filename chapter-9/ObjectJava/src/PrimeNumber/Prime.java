
package PrimeNumber;


public class Prime {
 private int num ;
 
 public Prime(int num){
     this.num = num ;
 }
 
 public boolean getPrime(){
     if(num<2)return false;
     for(int i = 2; i<num; i++){
         if(num%i==0){
             return false ;
         }
     }
     
        return true ;
 }
}
