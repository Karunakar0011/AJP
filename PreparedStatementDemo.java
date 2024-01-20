import java.sql.*;
public class PreparedStatementDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","postgres");
        Statement st = con.createStatement();
        PreparedStatement stmt = con.prepareStatement("insert into programmer values(?,?,?,?,?,?,?)");
        stmt.setString(1,"Pavansai");
        stmt.setDate(2,new Date(1961,12,13));
        stmt.setDate(3,new Date(1995,12,13));
        stmt.setString(4,"M");
        stmt.setString(5,"Fortran");
        stmt.setString(6,"Dbase");
        stmt.setFloat(7,3600);
        int cnt = stmt.executeUpdate();
        if(cnt!=0)
            System.out.println("Successfully inserted");
        else
            System.out.println("Not inserted");
        ResultSet rs=st.executeQuery("select * from programmer");
        while(rs.next())
            System.out.println(rs.getString(1)+" "+rs.getDate(2)+" "+rs.getDate(3)+"  "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getInt(7));

    }
}
