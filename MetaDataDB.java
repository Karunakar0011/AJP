import java.sql.*;
public class MetaDataDB {     public static void main(String[] args) {
    try {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        DatabaseMetaData metaData = con.getMetaData();
        String tableName = "programmer";
        ResultSet resultSet = metaData.getColumns(null, null, tableName, null);
        System.out.println("Column information for table: " + tableName);
        while (resultSet.next()) {
            String columnName = resultSet.getString("COLUMN_NAME");                 String dataType = resultSet.getString("TYPE_NAME");                 int columnSize = resultSet.getInt("COLUMN_SIZE");
            System.out.println("Column Name: " + columnName);
            System.out.println("Data Type: " + dataType);
            System.out.println("Column Size: " + columnSize);
            System.out.println("-----------");
        }
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
}
}
