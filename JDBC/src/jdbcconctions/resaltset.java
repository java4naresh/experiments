package jdbcconctions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class resaltset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id==");
	int id	=sc.nextInt();
	try {
		Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/f21","root","root");
		PreparedStatement ps	=con.prepareStatement("select * from student where id=?");
		ps.setInt(1, id);
	ResultSet rs=ps.executeQuery();
	if(rs.next())
			{
	int id1	=rs.getInt(1);
	String name	=rs.getString(2);
	int age=	rs.getInt(3);
	String gender=	rs.getString(4);
		String address=rs.getString(5);
		System.out.println(id+"::"+name+":::"+age+":::"+gender+"::"+address);
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
