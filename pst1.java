package jdbc;
import java.sql.*;

public class pst1 {

	public static void main(String[] args) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/morning9","root","root");
			PreparedStatement pst=con.prepareStatement("select * from student where roll>?");
			pst.setInt(1, 21);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			rs.close();
			con.close();
			} catch (Exception e) {
				System.out.println(e);
		}
	}
}
