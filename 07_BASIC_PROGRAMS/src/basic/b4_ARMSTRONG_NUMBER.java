package basic;

import java.util.Scanner;

public class b4_ARMSTRONG_NUMBER 
{

	public static void main(String[] args)
	{
		int n,n01,n02,sum=0,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NUMBER ");
		n=sc.nextInt();
		n01=n;
		while(n01>0)
		{
			r=n01%10;
			sum=sum+(r*r*r);
			n01=n01/10;
		}
		if(n==sum)
			System.out.println("ARMSTRONG NUMBER");
		else
			System.out.println("NOT AN ARMSTRONG NUMBER");
	}

}
