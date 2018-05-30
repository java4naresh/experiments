package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array1 {
	
public void As(String[] name)
{
	Arrays.sort(name);
	System.out.println(Arrays.toString(name));
	
	
}
public void dis(String[] name)
{

	 for(int i=name.length-1;i>=0;i--)
	 {
		 System.out.println(" "+name[i]);
	 }
	
}
public void as1(int[] a)
{
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
}
public void dsi(int[]a)
{
	for(int i=a.length-1;i>0;i--)
	{
		System.out.println(" "+a[i]);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name= {"veera","naresh","babu","ramesh"};
		int[] a= {345,654,678,678,456,654};
array1 obj=new array1();


	obj.As(name);
	obj.dis(name);
	obj.as1(a);
	obj.dsi(a);
	
	
	
	}

}
