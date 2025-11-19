import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class StudentUpdate {
    public static void updateStudentEmail(int id, String newEmail) {
        String sql = "UPDATE students SET email = ? WHERE id = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, newEmail);
            ps.setInt(2, id);
            int row = ps.executeUpdate();
            if (row > 0)
                System.out.println("Student updated!");
            else
                System.out.println("Student not found.");
        } catch (SQLException e) {
            System.out.println("Error updating student: " + e.getMessage());
        }
    }
}
