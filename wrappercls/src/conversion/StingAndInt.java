package conversion;

import java.util.Scanner;

public class StingAndInt {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Integer Object to String Object");
		System.out.println("Enter value");
		Integer i=sc.nextInt();
		String s=i.toString();//convert Object not data type.
		System.out.println(s);
		System.out.println("===============================================");
	
		System.out.println(" String Object to Integer Object ");
		System.out.println("Enter value");
		String r=sc.next();
		Integer e=Integer.valueOf(r);
		
		System.out.println("===============================================");
		
		System.out.println("integer to String");
		System.out.println("Enter value");
		int t=sc.nextInt();
	    String n=String.valueOf(t);
		System.out.println(n);
		System.out.println("===============================================");
		
		System.out.println(" String  to Integer ");
		System.out.println("Enter value");
		String g=sc.next();
		int w=Integer.parseInt(g);
		System.out.println(w);
		System.out.println("==============================================");
		
	
		
	}
}
