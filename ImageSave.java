package jdbc;
import java.sql.*;
import java.io.*;

public class ImageSave {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","root");
			String q="insert into images(pic) values(?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			
			FileInputStream fis=new FileInputStream("mypic.jpg");
			pstmt.setBinaryStream(1,fis,fis.available());
			pstmt.executeUpdate();
			System.out.println("done....");
			con.close();
		}catch(Exception e)
		{
			System.out.println("Error !!");
		}

	}

}
