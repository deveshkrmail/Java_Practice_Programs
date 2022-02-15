package bank;

public class BankSoftware 
{
	String name;
	long acNo;
	String type;
	float bal;
	
	void initialise()
	{	//name="Abc Xyz";	
		acNo=123456789;
		type="Savings";
		bal=10000;
	}
	
	void depo(int a)
	{
		bal=bal+a;
	}
	
	void withdraw(int a)
	{
		if(bal-a<1000)
			System.out.println("Min balance should be INR 1000.00");
		else
			bal=bal-a;
	}
	
	void print(String nameZZ)
	{
		System.out.println("Name:	"+nameZZ);
		System.out.println("Account No.:	"+acNo);
		System.out.println("Type:	"+type);
		System.out.println("Balance:	"+bal);
	}

}
