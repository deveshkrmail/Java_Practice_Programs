package a_ARRAY;

public class Sort_the_array_without_Sorting 
{

	public static void main(String[] args) 
	{		int integer[]= {1,0,1,0,1,0,1,0};
		int c0=0,c1=0,i;
		for(i=0;i<integer.length;i++)
		{
			if(integer[i]==0)
				c0++;
			else
				c1++;
		}
//		for(i=0;i<c1;i++)
//		{
//			integer[i]=1;
//		}
//		for(i=c1;i<(c0+c1);i++)
//		{
//			integer[i]=0;
//		}
		for(i=0;i<integer.length;i++)
		{
			if(c1>0)
			{
				integer[i]=1;
				c1--;
			}
			else
			{
				integer[i]=0;
			}
		}
		
		for(i=0;i<integer.length;i++)
		{
		System.out.print(integer[i]+" ");
		}
	}

}
