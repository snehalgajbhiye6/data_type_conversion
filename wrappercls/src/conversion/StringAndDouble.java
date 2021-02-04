package conversion;

import java.util.Scanner;

public class StringAndDouble {

	public static void main(String[] args) 
	{
		
        Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Double Object to String Object");
		System.out.println("Enter value");
		Double i=sc.nextDouble();
		String s=i.toString();
		System.out.println(s);
		System.out.println("===============================================");
	
		System.out.println(" String Object to Double Object ");
		System.out.println("Enter value");
		String r=sc.next();
		Double e=Double.valueOf(r);
		
		System.out.println("===============================================");
		
		System.out.println("Double to String");
		System.out.println("Enter value");
		double t=sc.nextDouble();
	    String n=String.valueOf(t);
		System.out.println(n);
		System.out.println("===============================================");
		
		System.out.println(" String  to double ");
		System.out.println("Enter value");
		String g=sc.next();
		double w=Double.parseDouble(g);
		System.out.println(w);
		System.out.println("==============================================");
		
}

}
