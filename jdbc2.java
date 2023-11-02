package jdbc;
import java.sql.*;

public class jdbc2 {

	public static void main(String[] args) throws Exception {
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/morning9","root","root");
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("select * from student");
     System.out.println("\nroll Name Address");
     while(rs.next()) {
    	 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
     }
     rs.close();
     con.close();
	}
	
	}

