package c;

import java.util.Scanner;

public class C2_Scanner_Class_in_Java_02 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int sum=0,count=0,n01;
		System.out.println("Start:	(for Average)");
		while(sc.hasNextInt())
		{
			System.out.println("Enter number:	");
			n01=sc.nextInt();
			sum=sum+n01;
			count++;
		}
		System.out.println("You ended!!!");
		float avg=(float)sum/count;
		System.out.println("Average: "+avg);
//		while(sc.has)
//		{
//			
//		}
	}

}
