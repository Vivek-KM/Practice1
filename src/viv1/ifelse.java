package viv1;

import java.util.Scanner;

public class ifelse {
	
	public static void main( String args[])
	{
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner( System.in);
		
		System.out.println("Enter number a");
		int  a= sc.nextInt();
		System.out.println("Enter number b");
		int b= sc.nextInt();
		System.out.println("Enter number c");
		int c= sc.nextInt();
		
		if(a>b &&a>c)
			System.out.println(a+ "is greater");
		else if (b>a&&b>c)
			System.out.println(b+ "is greater");
		else
			System.out.println(c+ "is greater");
			
	}
	

}
