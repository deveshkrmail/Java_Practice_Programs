package b;

public class B7_Variables_in_Java_03 
{

	public static void main(String[] args)
	{
		int mx01=7;
		System.out.println(mx01);
		
		{
			int mx02=8;
			System.out.println(mx02);
			System.out.println(mx01);
		}
		System.out.println(mx02);
	}

}
