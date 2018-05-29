package jdbcconctions;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("wellcome to tha atm");
		String name="veera";
	String password="veerababu";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the password==");
	String pass	=sc.next();
	if((password==pass))
	{
		System.out.println("welom to atm");
	}
	else
	{
		System.out.println("please re enter password");
	}

	}

}
