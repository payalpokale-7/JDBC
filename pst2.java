package jdbc;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class pst2 extends JFrame implements ActionListener{
JLabel l;
JTextField t;
JButton b;
pst2(){
	setSize(400,400);
	setVisible(true);
	setLayout(new FlowLayout());
	l=new JLabel("Id");
	t=new JTextField(15);
	b=new JButton("Find");
	add(l);add(t);add(b);
	b.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		int i1=Integer.parseInt(t.getText());
		if(e.getSource()==b)
		{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/morning9","root","root");
			PreparedStatement pst=con.prepareStatement("select * from student where roll=?");
			pst.setInt(1, i1);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			rs.close();
			con.close();
		}catch(Exception e2)
		{
			System.out.println(e2);
		}
		}
	}
		public static void main(String[] args) {
			new pst2();

		}
	}




