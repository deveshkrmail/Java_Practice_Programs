package eleventh;

import java.util.Scanner;

public class P245Q01 
{
	
	public static void main(String[] args) 
	{
		float basic,da,hra,pf,np,gp;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the employee: 	");
		name=sc.nextLine();
		System.out.println("Enter the basic:	");
		basic=sc.nextFloat();
		da=(0.25f)*basic;
		hra=(0.15f)*basic;
		pf=(0.0833f)*basic;
		np=basic+da+hra;
		gp=np-pf;
		System.out.println("Name of the employee:	"+name);
		System.out.println("Gross Pay: 		"+gp);
		

	}

}
