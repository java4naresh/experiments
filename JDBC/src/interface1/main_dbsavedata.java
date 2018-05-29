package interface1;

import java.util.Scanner;

import jdbcconctions.db_file_tosave;

public class main_dbsavedata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	System.out.println("enter the option save data===");
	System.out.println("1.db_to_save");
	System.out.println("2.file_savedata");
	System.out.println("3.exit");
    int option	 =sc.nextInt();
    dbsavetada  ref=null;
    switch(option)
    {
    case 1:
    ref= new db_to_save();
    break;
    case 2:
    	ref=new file_tosavedata();
    	break;
    case 3:
    	System.exit(0);
   
    }
    ref.savedata(id, name, age, gender, address);

	}


}
