package bank;
import java.util.Scanner;
public class BankSoftware 
{

	String name;
	long acNo;
	String type;
	public float bal;
	public BankSoftware()
	{
		name="Abc Xyz";
		acNo=1234567898;
		type="Savings";
		bal=10000;
		
	}
	void initialise() 
	{
		name="Abc Xyz";
		acNo=1234567898;
		type="Savings";
		bal=10000;
	}
	public void depo(int a)
	{
		bal=bal+a;
	}
	void withdraw(int a)
	{
		if(bal-a<1000)
			System.out.println("Min Bal should be INR 1000.00");
		else
			bal=bal-a;
	}
	public void print()
	{
		System.out.println("Name:"+name);
		System.out.println("Account No.:"+acNo);
		System.out.println("Type:"+type);
		System.out.println("Balance:"+bal);
	}
	
}
