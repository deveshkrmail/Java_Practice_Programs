package b_KEYWORDS;

public class B1_this_KEYWORD 
{	
	B1_this_KEYWORD()
	{
	this(7,9);
	}
	B1_this_KEYWORD(int a01, int b01)
	{
		System.out.println("I am in Constructer");
		System.out.println(a01);
		System.out.println(b01);
	}
	
	public static void main(String[] args) 
	{
		B1_this_KEYWORD b1=new B1_this_KEYWORD(7,9);
	}

}
