package twelveth;
import java.util.*;
public class P234Q_Input_Stream_a_INTEGER_TYPE 
{
	static int i,sum=0;
	static int integer[];
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five numbers:	");
		for(i=0;i<5;i++)
		{
			[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
			sum=sum+integer[i];
		System.out.println("The sum of INTEGERS: "+sum);
	}

}
