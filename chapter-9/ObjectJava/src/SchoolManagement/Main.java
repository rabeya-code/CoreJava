package SchoolManagement;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <Student> studentList = new ArrayList();
        studentList.add(rubi);
                
                
                
                
                
        Student rubi = new Student(1, "Rubi", 4);
        Student jahid = new Student(2, "jahid", 6);
        Student sujon = new Student(3, "sujon", 8);
        jahid.setFeesPaid(3000);
        jahid.setFeesPaid(3000);
        jahid.setFeesPaid(5000);
        jahid.setFeesPaid(2000);

        jahid.setFeesPaid(1500);
        jahid.setFeesPaid(2000);

        rubi.setFeesPaid(1000);
        rubi.setFeesPaid(1000);

        Teacher hasan = new Teacher(101, "Hasan", 1000);
        hasan.setSalary(hasan.getSalary());
        hasan.setSalary(hasan.getSalary());

        Teacher amina = new Teacher(110, "Amina", 2000);
        amina.setSalary(amina.getSalary());
        amina.setSalary(amina.getSalary());

        System.out.println("School Earned " + School.totalMoneyEarned);
        System.out.println("School Spent " + School.totalMoneySpent);
        System.out.println("School Remaining " + School.remainingFund());
    }
}
