package jdbcconctions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class file_savetodata implements db_file_tosave {
	public void savedata()
	{ ArrayList<String> list=new ArrayList<>();
		try {
			FileWriter fr=new FileWriter("E:\\student\\student2.txt");
			BufferedWriter br=new BufferedWriter(fr);
		br.write("list");
			br.newLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
