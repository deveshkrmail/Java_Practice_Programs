package bank;

import java.util.Scanner;

public class User 
{
	public void main01(String nameZ)
	{
		System.out.println("Welcome "+nameZ);
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter 'D' for deposit or 'W' for withdrwa: ");
		char c=sc.next().charAt(0);
		BankSoftware bs=new BankSoftware();
		if(c=='D')
			{
			System.out.println("Enter the amount to be deposit: ");
			int a=sc.nextInt();
			bs.depo(a);
			}
		else if(c=='W')
		{
			System.out.println("Eneter the amount to be withdraw:	");
			int a=sc.nextInt();
			bs.withdraw(a);
		}
		else
			System.out.println("Invalid Entry");
		bs.print(nameZ);
	}
}
