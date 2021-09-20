
package PrimeNumber;

public class CheckPrime {
    
    public static void main(String[] args){
        Prime ob1 = new Prime(9);
        boolean isPrime = ob1.getPrime();
        
        
        if(isPrime){
            System.out.println("It is Prime number");
        }else{
            System.out.println("It is not Prime number");
        }
        
           
          
    }
    
}
