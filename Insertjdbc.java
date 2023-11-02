package jdbc;
import java.sql.*;

public class Insertjdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//creating a connection
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="root";
			String password="root";
			Connection con=DriverManager.getConnection(url,username,password);
			
			
			//create a query
			
			String q="create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))";
			//create a statement:
			Statement stmt=con.createStatement();
		    stmt.executeUpdate(q);
		    System.out.println("table created in database..");
		    con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
