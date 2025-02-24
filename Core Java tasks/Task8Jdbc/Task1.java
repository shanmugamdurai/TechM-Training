package Task8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Task1 {
    private static final String URL = "jdbc:mysql://localhost:3306/abcd";
    private static final String USER = "root";
    private static final String PASSWORD = "******";

    private static final String INSERT_QUERY = "INSERT INTO your_table (column1, column2) VALUES (?, ?)";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            insertRecords(conn, 5);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertRecords(Connection conn, int count) {
        if (count <= 0)
            return;

        try (PreparedStatement pstmt = conn.prepareStatement(INSERT_QUERY)) {
            pstmt.setString(1, "Value " + count);
            pstmt.setInt(2, count);
            pstmt.executeUpdate();
            System.out.println("Inserted Row: " + count);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        insertRecords(conn, count - 1);
    }
}
