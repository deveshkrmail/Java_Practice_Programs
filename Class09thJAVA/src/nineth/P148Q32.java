package nineth;
/*Write a program to pass an integer as argument and check whether all digits in it are even
digit or not.*/
public class P148Q32
{

	public static void main(String args[])
	{
		int d,p=0,n01=17797;
		while(n01>0)
		{
			d=n01%10;
			if(d%2!=0)
			{
				p=3;
			}
			else 
			{
				p=4;
			}
			n01=n01/10;
		}
		if(p==3)
		{
			System.out.println("All digits are not EVEN.");
		}	
		System.out.println(p);
		

	}

}
