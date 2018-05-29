package jdbcconctions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class file_to_db_con {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileReader fr=new FileReader("E:\\student\\student1.txt");
	BufferedReader br=new BufferedReader(fr);
	br.readLine();
	br.readLine();
	String line=br.readLine();
	while(line!=null)
	{
		String[] values=line.split(",");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/f21","root","root");
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?)");
			//ps.setInt(1, Integer.parseInt(values[0]));
			//ps.setString(2, values[1]);
		//	ps.setInt(3, Integer.parseInt(values[2]));
			ps.setString(4, values[3]);
			ps.setString(5, values[4]);
		
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	line=br.readLine();	
		}
} catch (IOException e) {
	// TODO Auto-generated catch block 
	e.printStackTrace();
}
System.out.println("done");
	}



}
