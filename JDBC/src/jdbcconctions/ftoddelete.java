package jdbcconctions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ftoddelete {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>list=getline();
saverecord(list);
	}
	
	static void saverecord(ArrayList<String> list) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/f21","root","root");
			PreparedStatement ps=con.prepareStatement("delete from student");
			ps.executeUpdate();
			/*for(int i=0;i<list.size();i++) {
				String line=list.get(i);
				String[] values=line.split(",");
			ps.setInt(1, Integer.parseInt(values[0]));
			ps.setString(2, values[1]);
			ps.setInt(3, Integer.parseInt(values[2]));
			ps.setString(4, values[3]);
			ps.setString(5, values[4]);
			ps.executeUpdate();
			}*/
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	static ArrayList<String> getline() {
		
		ArrayList<String> list=new ArrayList();
		try {
			FileReader fr=new FileReader("E:\\student\\New Text Document.txt");
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
			while(line!=null)
			{
			String[]values=line.split(",");
			list.add(line);
			System.out.println(line);
			line=br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}

}
