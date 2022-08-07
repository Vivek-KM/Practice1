package viv1;

import java.util.Scanner;

public class Singlearray {
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter m");
		int m= sc.nextInt();
		System.out.println("Enter n");
		int n= sc.nextInt();
		
		System.out.println(" Enter array elements");
		
		int a[][]=  new int[m][n];
		
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
		a[i][j]= sc.nextInt();
		
		for( int i=0;i<m;i++)
		{
			for( int j=0;j<n;j++)
				{
			
				System.out.println("Element at a["+i+"]["+j+"]="+a[i][j]);
				}
		}
		
	}

}
