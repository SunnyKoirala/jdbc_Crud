package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class StudentDelete {
    public static void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int row = ps.executeUpdate();
            if (row > 0)
                System.out.println("Student deleted!");
            else
                System.out.println("Student not found.");
        } catch (SQLException e) {
            System.out.println("Error deleting student: " + e.getMessage());
        }
    }
}
