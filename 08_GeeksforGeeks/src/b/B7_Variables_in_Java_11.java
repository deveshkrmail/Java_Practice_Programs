package b;

public class B7_Variables_in_Java_11 
{
	static int cx01=70,cx02=80,cx03=90;
	public static void main(String[] args) 
	{
		System.out.println(cx01);
		System.out.println(cx02);
//		{
//			System.out.println(cx01);
//			System.out.println(cx02);
//		}
//		{
//			System.out.println(cx01);
//			System.out.println(cx02);
//		}
		B7_Variables_in_Java_11 Java_11=new B7_Variables_in_Java_11();
		Java_11.method01();
	}
	void method01()
	{
		System.out.println(cx03);
		System.out.println(cx02);
		System.out.println(cx01);
	}
}
