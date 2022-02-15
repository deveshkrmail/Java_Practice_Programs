package encapsulation;

public class Test01 
{

	public static void main(String[] args) 
	{
	Test02 t02=new Test02();
	
	t02.setA(100.0);
	
	double z=t02.getA();
	
	System.out.println(z);

	}

}
