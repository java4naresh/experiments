package com.naresh.experiments;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		int n,m,a=0;
		System.out.println("enter any value");
		Scanner sc=new Scanner(System.in);
	 n	=sc.nextInt();
	 m=n;
	while(n>0)
	{
		int x=n%10;
		 a=a*10+x;
		 n=n/10;
		
	}
	if(a==m)
	{
		System.out.println("enter value====="+m+"==it is palandrom");
	}
	else
	{
		System.out.println("enter value is======"+m+"==it is not palandrom");
	}
				
	}

}
