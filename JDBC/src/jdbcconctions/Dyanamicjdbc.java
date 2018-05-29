package jdbcconctions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
//insert the values throw user

public class Dyanamicjdbc {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id number==");
	int id	=sc.nextInt();
		System.out.println("enter the name==");
	     String name	=sc.next();
	     System.out.println("enter the age==");
    int age	=sc.nextInt();
    System.out.println("enter the gender==");
       String gender   = sc.next();
       System.out.println("enter the address==");
    String address  = sc.next();
    
    try {
		Class.forName("com.mysql.jdbc.Driver");
	Connection	 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/f21","root","root");
	PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?)" );
	
	ps.setInt(1, id);
	ps.setString(2, name);
	ps.setInt(3, 24);
	ps.setString(4, gender);
	ps.setString(5, address);
ps.executeUpdate();
System.out.println("done");
	}
		catch( ClassNotFoundException c) {
			c.getStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
	}


/*public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id number==");
int id	=sc.nextInt();
	System.out. println("enter the name==");
     String name	=sc.next();
     System.out.println("enter the age==");
int age	=sc.nextInt();
System.out.println("enter the gender==");
   String gender   = sc.next();
   System.out.println("enter the address==");
String address  = sc.next();

try {
	Class.forName("com.mysql.jdbc.Driver");
Connection	 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/f21","root","root");
PreparedStatement ps=con.prepareStatement("Delete from student where id=?");

ps.setInt(1, id);
ps.setString(2, name);
ps.setInt(3, age);
ps.setString(4, gender);
ps.setString(5, address);
ps.executeUpdate();
System.out.println("done");
}
	catch( ClassNotFoundException c) {
		c.getStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id number==");
	int id	=sc.nextInt();
		System.out.println("enter the name==");
	     String name	=sc.next();
	    /* System.out.println("enter the age==");
	int age	=sc.nextInt();
	System.out.println("enter the gender==");
	   String gender   = sc.next();
	   System.out.println("enter the address==");
	String address  = sc.next();*/

	try {
		Class.forName("com.mysql.jdbc.Driver");
	Connection	 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/f21","root","root");
	PreparedStatement ps=con.prepareStatement("update student set name=? where id=?");

	ps.setInt(2, id);
	ps.setString(1, name);
	/*ps.setInt(3, age);
	ps.setString(4, gender);
	ps.setString(5, address);*/
	ps.executeUpdate();
	System.out.println("done");
	}
		catch( ClassNotFoundException c) {
			c.getStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

