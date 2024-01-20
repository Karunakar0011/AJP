import java.sql.*;
public class ResultSetDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection con =
                DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",  "postgres", "postgres");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from programmer");
        ResultSetMetaData rsmd = rs.getMetaData();
        int cnt = rsmd.getColumnCount();
        int i=1;
        while(rs.next()){
            while(i<cnt){
            System.out.println(rs.getObject(i++));
        }
        }
        con.close();
    }
}  
