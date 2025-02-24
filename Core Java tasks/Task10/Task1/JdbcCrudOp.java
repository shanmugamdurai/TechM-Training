package Task10.Task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCrudOp {
    String url = "jdbc:mysql://localhost:3306/abcd";
     String username = "root";
     String password = "******";
    public void selectRecords() throws SQLException {
        String query = "select * from student";
        Connection connection = DriverManager.
                getConnection(url,username, password);
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()) {

            System.out.print("\nId is:" + rs.getInt(1));
            System.out.print("\nName is:" + rs.getString(2));
            System.out.print("\nMark is:" + rs.getInt(3));

        }
        connection.close();
    }
    public void insertRecord() throws SQLException {

        String query = "insert into student values(28, 'Vasu',68);";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        Statement st = connect.createStatement();
        int row = st.executeUpdate(query);
        System.out.println("Number of rows affected:"
                +row);
        connect.close();
    }
    public void deleteRecordWithPreparedStatement(int id) throws SQLException {

        String query = "delete from student where sid=?;";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1,id);
        System.out.println("Number of rows affected:"
                +pst.executeUpdate());
        connect.close();
    }
    public void updateRecordWithPreparedStatement(int mark, String sname) throws SQLException {


        String query = "update student set mark=? where sname=?;";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1,mark);
        pst.setString(2,sname);
        System.out.println("Number of rows affected:"
                +pst.executeUpdate());
        connect.close();
    }
}
