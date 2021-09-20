package SchoolBuilding;

public class Main {

    public static void main(String[] agrs) {
        Student hasan = new Student(501, "Hasan", 5);
        hasan.setFeesPaid(3000);
        
        Student sujon = new Student(602, "Sujon", 6);
        sujon.setFeesPaid(7000);
        
        Student yunus = new Student(210, "Yunus", 2);
        yunus.setFeesPaid(9000);
        
        Student sakib = new Student(909, "Sakib", 9);
        sakib.setFeesPaid(10000);
        
        Student jahid = new Student(1005, "Jahid", 10);
        jahid.setFeesPaid(20000);
        
        Student yakub = new Student(401, "Yakub", 3);
        yakub.setFeesPaid(5000);
        
        Student amin = new Student(701, "Amina", 7);
        amin.setFeesPaid(8000);
        
        Student saiful = new Student(801, "Saiful", 8);
        amin.setFeesPaid(12000);

        System.out.println("total earn from student :"+School.totalMoneyEarned );
        
        
        Teacher habib = new Teacher(234,"Habib",5000);
        habib.setSalary( habib.getSalary());
        
        Teacher alom = new Teacher (2002,"Alom",7000);
        alom.setSalary( alom.getSalary());
        
        
        
        System.out.println("Total spent for teacher : "+ School.totalMoneySpent);
        
        System.out.println("Total remainingFound the school is : "+School.remainingFound());
    }
}
