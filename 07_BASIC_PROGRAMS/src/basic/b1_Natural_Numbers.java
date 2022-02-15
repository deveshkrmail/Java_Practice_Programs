package basic;
import java.util.*;
public class b1_Natural_Numbers 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit, till you want to print NATURAL NUMBERS: 	");
		int n01=sc.nextInt();
		for(int i=1;i<=n01;i++)
		{
			System.out.println(i);
		}
	}

}
