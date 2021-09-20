
package schoolinformation;


public class student {

   
    private int student_id;
    private String student_name;
    private String student_stand;
    private String student_contact;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_stand() {
        return student_stand;
    }

    public void setStudent_stand(String student_stand) {
        this.student_stand = student_stand;
    }

    public String getStudent_contact() {
        return student_contact;
    }

    public void setStudent_contact(String student_contact) {
        this.student_contact = student_contact;
    }

    public student(int student_id, String student_name, String student_stand, String student_contact) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_stand = student_stand;
        this.student_contact = student_contact;
    }

    public student() {
    }
    
    
     @Override
    public String toString() {
        return "student{" + "student_id=" + student_id + ", student_name=" + student_name + ", student_stand=" + student_stand + ", student_contact=" + student_contact + '}';
    }
}
