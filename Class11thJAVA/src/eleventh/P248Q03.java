package eleventh;
import java.util.*;
public class P248Q03 
{
	public static void main(String[] args) 
	{
		float n01,n02,s,d,p,q,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no.		:");
		n01=sc.nextFloat();
		System.out.println("Enter the second no.		:");
		n02=sc.nextFloat();
		s=n01+n02;
		d=n01-n02;
		p=n01*n02;
		q=n01/n02;
		r=n01%n02;
		System.out.println("Sum					:"+s);
		System.out.println("Difference			:"+d);
		System.out.println("Product				:"+p);
		System.out.println("Quotient			:"+q);
		System.out.println("Remainder			:"+r);
	}
}


