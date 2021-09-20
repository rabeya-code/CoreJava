package SchoolBuilding;



public class School {
    
    static int totalMoneyEarned;
    static int totalMoneySpent;
    
    public static int remainingFound(){
        return totalMoneyEarned - totalMoneySpent;
    }
}
