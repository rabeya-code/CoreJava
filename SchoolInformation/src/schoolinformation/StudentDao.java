
package schoolinformation;


public interface StudentDao {
 void store(student student);
 void update(student student);
 void delete(int student_id);
 student getStudent(int student_id);
 void viewStudent();


}
