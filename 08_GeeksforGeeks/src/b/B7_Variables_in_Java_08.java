package b;

public class B7_Variables_in_Java_08 
{
	static int cx01=7,cx02=8,cx03=9;
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
		B7_Variables_in_Java_08 Java_08=new B7_Variables_in_Java_08();
		Java_08.method01();
	}
	void method01()
	{
		System.out.println(cx03);
	}
}
