package schoolinformation;

public class SchoolInformation {

    public static void main(String[] args) {
        student student = new student(102, "hasan", "one", "019776645");
        

        StudentDao sdao = new StudentDaoImp();

        //sdao.store(student);
        
       
        //sdao.store(student);
        //sdao.update(student);
        // sdao.delete(student1.getStudent_id());
      System.out.println(student.getStudent_id());
      sdao.viewStudent();
       
    }

}
