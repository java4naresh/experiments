package jdbcconctions;

import java.util.Scanner;

public class main_db {

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
	System.out.println("1.db_to_file");
	System.out.println("2.db_savedata");
    String option	 =sc.next();
    db_file_tosave dbf=null;
   
  
    
    

	
	}

}
