package Task8.Task4;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        JdbcMenu jd = new JdbcMenu();
        Scanner sc = new Scanner(System.in);
        System.out.println("This is Student table from MySql");
        System.out.println("Enter your choice");
        String ch = sc.next();
        switch (ch) {
            case "view":
                System.out.println("You have chosen to view the table contents");
                jd.selectRecords();
                break;
            case "insert":
                System.out.println("You have chosen to insert into the table. ");
                jd.insertRecord();
                break;
            case "update":
                System.out.println("You have chosen to update the values in the table. ");
                jd.updateRecordWithPreparedStatement(76, "Daniel");
                break;
            case "delete":
                System.out.println("You have chosen to delete the values in the table. ");
                jd.deleteRecordWithPreparedStatement(56);
                break;
            case "exit":
                break;
        }
        sc.close();
    }
}
