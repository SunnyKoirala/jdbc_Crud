package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class StudentCreate {
    public static void insertStudent(String name, int age, String email) {
        String sql = "INSERT INTO students (name, age, email) VALUES (?, ?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, email);
            ps.executeUpdate();
            System.out.println("Student inserted!");
        } catch (SQLException e) {
            System.out.println("Error inserting student: " + e.getMessage());
        }
    }
}
