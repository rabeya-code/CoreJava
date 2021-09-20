
package SchoolManagement;


public class School {
   static int totalMoneyEarned;
   static int totalMoneySpent;
   
   public static int remainingFund(){
       return totalMoneyEarned - totalMoneySpent;
   }
}
