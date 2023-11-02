package jdbc;
import java.sql.*;


		public class jdbc1 {
			public static void main(String[] args) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/morning9","root","root");
					Statement st= con.createStatement();
					//int i=st.executeUpdate("insert into student values(23,'akshay','Pune')");
					//int i=st.executeUpdate("insert into student values(22,'ritik','Nagpur')")
					int i=st.executeUpdate("insert into student values(24,'ritika','pune')");
					//int i=st.executeUpdate("insert into student values(21,'Priya','mumbai')");
					System.out.println("inserted"+i);
					con.close();
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
	}


