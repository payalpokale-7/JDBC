package jdbc;
import java.sql.*;
import java.util.*;


public class updpr {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int roll1;
		String name1,add1;
		System.out.println("enter roll,name and address:");
		roll1=sc.nextInt();
		name1=sc.next();
		add1=sc.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/morning9","root","root");
		PreparedStatement pst=con.prepareStatement("update student set name=?,address=? where roll=?");
		pst.setString(1, name1);
		pst.setString(2, add1);
		pst.setInt(3, roll1);
		int i=pst.executeUpdate();
		System.out.println("Success,"+i);
		con.close();
	}

}
