
package SchoolManagement;


public class Student {
   private int id;
   private String name;
   private int grade; 
   private int feesPaid;
   private int feesTotal;
   
   public Student(int id, String name, int grade){
       this.id = id;
       this.name = name;
       this.grade = grade;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
        feesTotal += feesPaid;
        School.totalMoneyEarned += feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }
   
   
}
