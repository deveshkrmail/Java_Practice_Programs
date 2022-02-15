package teachers;

public class Teacher {

	public static int main(String args[])
	{
	int bs=15000;
	return bs;
	}
}

class HSTeachers extends Teacher
{
	public void main01(String args[])
	{
	int exs=20000;
	HSTeachers hs=new HSTeachers();
	int a=hs.main();
	
	System.out.println(a+exs);
	}


}

class INTERTeachers extends Teacher
{
	public void main02(String args[])
	{
		int exs=40000;
		INTERTeachers in=new INTERTeachers();
		int a=in.main();
		System.out.println(a+exs);
		
	}
}