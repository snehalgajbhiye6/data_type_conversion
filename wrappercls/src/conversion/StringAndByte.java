package conversion;

import java.util.Scanner;

public class StringAndByte {

	public static void main(String[] args)
	{
		
Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Byte Object to String Object");
		System.out.println("Enter value");
		Byte i=sc.nextByte();
		String s=i.toString();
		System.out.println(s);
		System.out.println("===============================================");
	
		System.out.println(" String Object to Byte Object ");
		System.out.println("Enter value");
		String r=sc.next();
		Byte e=Byte.valueOf(r);
		
		System.out.println("===============================================");
		
		System.out.println("byte to String");
		System.out.println("Enter value");
		byte t=sc.nextByte();
	    String n=String.valueOf(t);
		System.out.println(n);
		System.out.println("===============================================");
		
		System.out.println(" String  to byte ");
		System.out.println("Enter value");
		String g=sc.next();
		byte w=Byte.parseByte(g);
		System.out.println(w);
		System.out.println("==============================================");
		
}

}
