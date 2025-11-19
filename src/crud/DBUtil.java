package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb?useSSL=false";
    private static final String USER = "root";        // Change as needed
    private static final String PASSWORD = "root"; // Change as needed

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
