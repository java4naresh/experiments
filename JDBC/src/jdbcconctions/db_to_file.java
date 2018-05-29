package jdbcconctions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class db_to_file {  

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		try {
			FileWriter fr=new FileWriter("E:\\student\\veera.text");
			
			BufferedWriter br=new BufferedWriter(fr);
		br.write("");
			
			Class.forName("com.mysql.jdbc.Driver");
			
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/f21","root","root");
			PreparedStatement ps	=con.prepareStatement("select * from student");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
			int id	=rs.getInt(1);
		    String name	=rs.getString(2);
		    int age=rs.getInt(3);
		    String gender=rs.getString(4);
		    String address=rs.getString(5);
		    String line1=id+","+name+","+age+","+gender+","+address;	
		    br.write(line1);
		    br.newLine();
		} 
			br.close();
			fr.close();
		}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	
		

	}

}
