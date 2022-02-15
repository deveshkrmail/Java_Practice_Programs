package b;

public class B7_Variables_in_Java_06 
{
	static int cx01=7,cx02=8;
	public static void main(String[] args) 
	{
		System.out.println(cx01);
		System.out.println(cx02);
		{
			System.out.println(cx01);
			System.out.println(cx02);
		}
		{
			System.out.println(cx01);
			System.out.println(cx02);
		}
		
	}
}
