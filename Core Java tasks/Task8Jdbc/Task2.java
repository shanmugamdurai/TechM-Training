package Task8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Task2 {
    String url = "jdbc:mysql://localhost:3306/abcd";
    String username = "root";
    String password = "******";

    public void selectRecords() throws SQLException {
        String query = "select * from student";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {

            System.out.print("\nId is:" + rs.getInt(1));
            System.out.print("\nName is:" + rs.getString(2));
            System.out.print("\nMark is:" + rs.getInt(3));

        }
        connection.close();
    }

    public void updateRecordWithPreparedStatement(int mark, String sname) throws SQLException {

        String query = "update student set mark=? where sname=?;";
        Connection connect = DriverManager.getConnection(url, username, password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1, mark);
        pst.setString(2, sname);
        System.out.println("Number of rows affected:"
                + pst.executeUpdate());
        connect.close();
    }

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the student: ");
        String name = sc.nextLine();
        System.out.println("enter the mark to be updated from the student table:");
        int mark = sc.nextInt();
        Task2 t = new Task2();
        t.selectRecords();
        t.updateRecordWithPreparedStatement(mark, name);
        sc.close();
    }
}
