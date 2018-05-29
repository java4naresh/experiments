package jdbcconctions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class db_savedata implements db_file_tosave {
public void savedata()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id==");
 int id     =sc.nextInt();
	System.out.println("enter name==");
String name=	sc.next();
	System.out.println("enter age==");
int age=	sc.nextInt();
	System.out.println("enter gender==");
	String gender=sc.next();
	
System.out.println("enter adress==");
String address=sc.next();
try {
	Class.forName("com.mysql.jdbc.Driver");
	
		Connection con=DriverManager.getConnection("jdbc:mysql:S//localhost:3306/f21","root","root");
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, age);
		ps.setString(4, gender);
		ps.setString(5, address);
		
		ps.executeUpdate();
		
		
		
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
}
}
