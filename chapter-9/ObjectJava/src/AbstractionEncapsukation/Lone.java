
package AbstractionEncapsukation;


public class Lone {
  
    private double annualInterestRate ;
    private int numberOfYears ;
    private double loanAmount ;
    private java.util.Date loanDate ;
    
    
    //default constructor
    public Lone(){
        this(2.5, 1, 1000);
    }
    
    public Lone(double annualInterestRate, int numberOfYears, double loanAmount){
       this.annualInterestRate =  annualInterestRate;
       this.numberOfYears = numberOfYears ;
       this.loanAmount = loanAmount ;
       loanDate = new java.util.Date();
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate =  annualInterestRate;
    }
    
    
    public int getnumberOfYears(){
        return numberOfYears ;
    }
    public void setnumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears ;
    }
    
   public double getloanAmount(){
        return loanAmount ;
    }
    public void setloneAmount(double loanAmount){
        this.loanAmount = loanAmount ;
    } 
    
    //find monthly payment
    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate,numberOfYears*12)));
        return monthlyPayment;
    }
    
    
    
    //find total payment
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment()* numberOfYears*12 ;
        return totalPayment ;
    
    }
    
    
    //return loan date
    public java.util.Date getLoanDate(){
        return loanDate;
    }
    

    
}
