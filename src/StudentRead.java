import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class StudentRead {
    public static void getAllStudents() {
        String sql = "SELECT * FROM students";
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String email = rs.getString("email");
                System.out.printf("%d | %s | %d | %s%n", id, name, age, email);
            }
        } catch (SQLException e) {
            System.out.println("Error reading students: " + e.getMessage());
        }
    }
}
