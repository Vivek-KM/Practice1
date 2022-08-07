package viv1;

import java.util.Scanner;

public class whileloo {

	public static void main(String args[])
	{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		int a= sc.nextInt();
		
		while(a<=10)
		{
			System.out.println("Number is:" +a);
			a++;
		}
	}
}
