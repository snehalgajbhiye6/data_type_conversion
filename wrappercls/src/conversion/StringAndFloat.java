package conversion;

import java.util.Scanner;

public class StringAndFloat {

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Float Object to String Object");
		System.out.println("Enter value");
		Float i=sc.nextFloat();
		String s=i.toString();
		System.out.println(s);
		System.out.println("===============================================");
	
		System.out.println(" String Object to Float Object ");
		System.out.println("Enter value");
		String r=sc.next();
		Float e=Float.valueOf(r);
		
		System.out.println("===============================================");
		
		System.out.println("float to String");
		System.out.println("Enter value");
		float t=sc.nextFloat();
	    String n=String.valueOf(t);
		System.out.println(n);
		System.out.println("===============================================");
		
		System.out.println(" String  to Float ");
		System.out.println("Enter value");
		String g=sc.next();
		float w=Float.parseFloat(g);
		System.out.println(w);
		System.out.println("==============================================");
		
		}

}
