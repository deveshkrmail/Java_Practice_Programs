package a_method_overloading;

public class B_not_method_overloading 
{
	int sum01(int a,int b)
	{
		return (a+b);
	}
	
	double sum02(double a, double b)
	{
		return (a+b);
	}
	
	int sum03(int a, int b, int c)
	{
		return (a+b+c);
	}
	
	double sum04(double a, double b, double c)
	{
		return(a+b+c);
	}
	
	public static void main(String[] args) 
	{
		B_not_method_overloading nmol=new B_not_method_overloading();
		System.out.println(nmol.sum01(10, 20));
		System.out.println(nmol.sum02(10.0, 20.0));
		System.out.println(nmol.sum03(10, 20, 30));
		System.out.println(nmol.sum04(10.0, 20.0, 30.0));
	}

}
