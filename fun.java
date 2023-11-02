package jdbc;
import java.sql.*;

public class fun {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			//creating a connection
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="root";
			String password="root";
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			
			//create a query
			String q="insert into table1(tName,tCity) values(?,?)";
			//get the PreparedStatement object
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values to query
			
			pstmt.setString(1, "Durgesh Tiwari");
			pstmt.setString(2, "Lucknow ");
			
			pstmt.executeUpdate();
			
			System.out.println("inserted...");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
