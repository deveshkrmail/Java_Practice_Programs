package basic;

import java.util.Scanner;

public class b2_REVERSE 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NUMBER: 	");
		int n01=sc.nextInt();
		int n02=0,r;
		while(n01>0)
		{
			r=n01%10;
			n02=n02*10+r;
			n01=n01/10;
		}
		System.out.println("Reverse: "+n02);
	}
}
