package c;

import java.util.Scanner;

public class C2_Scanner_Class_in_Java_01 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Are you a strong person?:   ");
		boolean boo01=sc.nextBoolean();
		System.out.println("What is the last letter of your last name:  ");
		char cha01=sc.next().charAt(0);
		System.out.println("What is the end limit of byte data type?:   ");
		byte byt01=sc.nextByte();
		System.out.println("What is the end limit of short data type?:   ");
		short sho01=sc.nextShort();
		System.out.println("What is the end limit of int data type?:   ");
		int int01=sc.nextInt();
		System.out.println("What is the end limit of long data type?:   ");
		long lon01=sc.nextLong();
		System.out.println("How many no. of decimals we can put on float data type?:   ");
		float flo01=sc.nextFloat();
		System.out.println("How many no. of decimals we can put on double data type?:   ");
		double dou01=sc.nextDouble();
		
		System.out.println("You entered the booean: "+boo01);
		System.out.println("You entered the char: "+cha01);
		System.out.println("You entered the byte: "+byt01);
		System.out.println("You entered the short: "+sho01);
		System.out.println("You entered the int: "+int01);
		System.out.println("You entered the long: "+lon01);
		System.out.println("You entered the float: "+flo01);
		System.out.println("You entered the double: "+dou01);
		
		
	}

}
