package a_ARRAY;

public class Sort_the_array_without_Sorting_Practice01_times 
{

	public static void main(String[] args) 
	{
		int A[]= {1,0,1,0,1,0,1,0};
		int i,c1=0,c0=0;
		for(i=0;i<A.length;i++)
		{
			if(A[i]==1)
				c1++;
			else
				c0++;
		}
		for(i=0;i<A.length;i++)
		{
			if(c1>0)
			{
				A[i]=1;
				c1--;
			}
			else
			{
				A[i]=0;
			}
		}
		for(i=0;i<A.length;i++)
			System.out.print(A[i]+" ");
		
		
	}

}
