package a_method_overloading;

public class A_method_overloading 
{
	int sum(int a,int b)
	{
		return (a+b);
	}
	
	double sum(double a, double b)
	{
		return (a+b);
	}
	
	int sum(int a, int b, int c)
	{
		return (a+b+c);
	}
	
	double sum(double a, double b, double c)
	{
		return(a+b+c);
	}
	
	public static void main(String args[])
	{
		A_method_overloading mol=new A_method_overloading();
		System.out.println(mol.sum(10, 20));
		System.out.println(mol.sum(10, 20, 30));
		System.out.println(mol.sum(10.0, 20.0));
		System.out.println(mol.sum(10.0, 20.0, 30.0));
		
	}
	
}
