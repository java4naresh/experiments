package interface1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class db_to_save implements dbsavetada {
	
	public void savedata(int id,String name,int age,String gender,String address)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/f21","root","root");
			PreparedStatement ps=con.prepareStatement("insert into Student values(?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setString(4, gender);
			ps.setString(5, address);
			ps.executeUpdate();
			
			
			System.out.println("done");
			
			
		} 
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
