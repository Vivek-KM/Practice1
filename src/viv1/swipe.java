package viv1;

import java.util.Scanner;
public class swipe {

	public static void main( String args[])
	{
		
		Scanner SC= new Scanner(System.in);
		
		System.out.println("Enter number a");
		int a= SC.nextInt();
		System.out.println("Enter number b");
		int b= SC.nextInt();
		
		System.out.println("Numbers are: a="+a+ "& b="+b);
		
		int  c=a;
		     a=b;
		     b=c;
		     
		     System.out.println("Swapped numbers are: a="+a+ "& b="+b);
	
	}
}
