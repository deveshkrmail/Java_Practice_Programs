package bank;

import java.util.Scanner;

public class User {
	public static void main01(String name)
	{
		System.out.println("Welcome "+name);
		BankSoftware bs=new BankSoftware();
		//bs.initialise();
		System.out.println("Enter 'D' for Deposit or 'W' for withdraw: ");
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c=='D')
		{
			System.out.println("Enter the amount to be deposited:");
			int a=sc.nextInt();
			bs.depo(a);
		}
		else if(c=='W')
		{
			System.out.println("Eneter the amount to be withdraw: ");
			int a=sc.nextInt();
			bs.withdraw(a);
		}
		else
		{
			System.out.println("Invalid Input");
		}
		bs.print();
	}


}
