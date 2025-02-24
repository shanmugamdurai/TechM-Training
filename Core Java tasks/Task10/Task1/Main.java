package Task10.Task1;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        JdbcCrudOp cr = new JdbcCrudOp();
        cr.selectRecords();
        cr.insertRecord();
        cr.deleteRecordWithPreparedStatement(56);
        cr.updateRecordWithPreparedStatement(76,"Daniel");

    }
}
