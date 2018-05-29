package interface1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class file_tosavedata implements dbsavetada {
	public void savedata(int id,String name,int age,String gender,String address)
	{
		try {
			FileWriter fr=new FileWriter("E:\\student\\student2.txt");
			BufferedWriter bw=new BufferedWriter(fr);
			bw.write(id+"==");
			bw.write(name+"==");
			bw.write(age+"==");
			bw.write(gender+"==");
			bw.write(address+"==");
			bw.newLine();
			bw.close();
			fr.close();
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
