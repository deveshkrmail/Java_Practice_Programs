package basic;
import java.util.*;
public class b3_FIBBONACI 
{

	public static void main(String[] args) 
	{
		int n,a=0,b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=sc.nextInt();
		if(n==1||n==2)
		{
			if(n==1)
			{
				System.out.println(0);
			}
			else if(n==2)
			{
				System.out.println(0+" "+1);
			}
		}
		else
		{
			System.out.print(0+" "+1+" ");
			for(int i=3;i<=n;i++)
			{
				int c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
		}
	}

}
