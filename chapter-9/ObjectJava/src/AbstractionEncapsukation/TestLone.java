
package AbstractionEncapsukation;

import java.util.Scanner;
public class TestLone {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);  
      
      System.out.println("Enter annual interest rate (8.25) : ");
      double annualInterestRate = input.nextDouble();
      
      System.out.println("Enter number of years as an integer : ");
      int numberOfYears = input.nextInt();
      
       System.out.println("Enter Loan amount(120000) : ");
       double loanAmount = input.nextDouble();
       
       Lone loan = new Lone(annualInterestRate,numberOfYears,loanAmount);
       
       
       System.out.printf(loan.getLoanDate().toString(),loan.getMonthlyPayment(),loan.getTotalPayment());
                       
      
    }
}
