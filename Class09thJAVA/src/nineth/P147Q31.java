package nineth;
import java.util.*;
import java.math.*;
public class P147Q31 
{
	static int n02;
	public static void main(String[] args) 
	{
		
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter an integer:	");
		int n01=sc.nextInt();
		while(n01>0)
		{
			int d=n01%10;
			if(d%2!=0)
			{
				  n02=d+d*((int)Math.pow(10,c++));
				  
			}	
			n01=n01/10;
		}
		System.out.println(n02);
		
	}
	
}
