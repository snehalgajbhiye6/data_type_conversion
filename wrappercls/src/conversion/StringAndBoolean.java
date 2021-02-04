package conversion;

import java.util.Scanner;

public class StringAndBoolean {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Boolean Object to String Object");
		System.out.println("Enter value");
		Boolean i=sc.nextBoolean();
		String s=i.toString();
		System.out.println(s);
		System.out.println("===============================================");
	
		System.out.println(" String Object to Integer Object ");
		System.out.println("Enter value");
		String r=sc.next();
		Boolean e=Boolean.valueOf(r);
		
		System.out.println("===============================================");
		
		System.out.println("boolean to String");
		System.out.println("Enter value");
		boolean t=sc.nextBoolean();
	    String n=String.valueOf(t);
		System.out.println(n);
		System.out.println("===============================================");
		
		System.out.println(" String  to boolean ");
		System.out.println("Enter value");
		String g=sc.next();
		boolean w=Boolean.parseBoolean(g);
		System.out.println(w);
		System.out.println("==============================================");
		
	}

}
