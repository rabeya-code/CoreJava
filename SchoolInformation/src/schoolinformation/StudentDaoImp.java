package schoolinformation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDaoImp implements StudentDao {

    Connection conn = DatabaseConnector.connect();

    @Override
    public void store(student student) {

        if (conn != null) {

            try {

                String sql = "insert into student_table values(?,?,?,?);";
                PreparedStatement stInfo = conn.prepareStatement(sql);

                stInfo.setInt(1, student.getStudent_id());
                stInfo.setString(2, student.getStudent_name());
                stInfo.setString(3, student.getStudent_stand());
                stInfo.setString(4, student.getStudent_contact());
                int result = stInfo.executeUpdate();

                System.out.println("Student information inserted successfully");

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        } else {
            System.out.println("Connection failed");
        }
    }

    @Override
    public void update(student student) {
        if (conn != null) {

            try {

                String sql = "update student_table set student_name = ?, student_stand = ?, student_contact = ?, where student_id = ?";
                PreparedStatement stUp = conn.prepareStatement(sql);

                stUp.setInt(4, student.getStudent_id());
                stUp.setString(1, student.getStudent_name());
                stUp.setString(2, student.getStudent_stand());
                stUp.setString(3, student.getStudent_contact());
                int result = stUp.executeUpdate();

                System.out.println("Student information updated successfully");

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        } else {
            System.out.println("Connection failed");
        }

    }

    @Override
    public void delete(int student_id) {
        String sql = "delete from student_table where student_id = ?";
        PreparedStatement stInfoD = null;
        try {
            stInfoD = conn.prepareStatement(sql);

            stInfoD.setInt(1, student_id);
            stInfoD.execute();
            System.out.println("Data deleted successfully");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public student getStudent(int student_id) {
        String sql = "select* from student_table where student_id = ?";
        try {
            PreparedStatement gStu = conn.prepareStatement(sql);
            gStu.setInt(1, student_id);
            ResultSet rs = gStu.executeQuery();
            rs.next();
            student student = new student(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
            );
            return student;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    @Override
    public void viewStudent() {
        String sql = "select * from student_table; ";
        try {
            PreparedStatement vStu = conn.prepareStatement(sql);

            ResultSet rs = vStu.executeQuery();
            while (rs.next()) {
                student stu = new student(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
                System.out.println(stu);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}