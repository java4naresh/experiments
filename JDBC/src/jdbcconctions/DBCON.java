package jdbcconctions;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;




public class DBCON {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("insert qurey======");
		try {
		Class.forName("com.mysql.jdbc.Driver");
	Connection	 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/f21","root","root");
	PreparedStatement ps=con.prepareStatement("insert into student values(10,'rani',65,'m','hyd')" );
ps.executeUpdate();
System.out.println("done");
	}
		catch( ClassNotFoundException c) {
			c.getStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("*********************************************************************************************");
		System.out.println("delete qurey=========");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/f21","root","root");
			PreparedStatement ps	=con.prepareStatement("Delete  from student where id=4");
			ps.executeUpdate();
			System.out.println("done");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				 
	}
	public static void main3(String[] args) {
		
	
		System.out.println("update qurey=====");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/f21","root","root");
				PreparedStatement ps=con.prepareStatement("update student set gender='male' where id=7");
				ps.executeUpdate();
				System.out.println("done");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void main2(String[] args) {
		
	
		System.out.println("update qurey==");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/f21","root","root");
			PreparedStatement ps	=con.prepareStatement("delete from student where id=1");
			ps.executeUpdate();
			System.out.println("done");
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
