package viv1;

import java.util.Scanner;
public class Boundary {
	
	public static void  main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the row");
		int row= sc.nextInt();
		System.out.println("Enter the column");
		int col=sc.nextInt();
		
		int i,j, sum=0;
		
		int a[][]= new int[row][col];
		
		System.out.println("Enter the matrix elements:");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The matrix is:");
		
		for (i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println(" ");
		}
		
       System.out.println("The boundary matrix is:");
		
		for (i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
			 if(i==0||j==0||i==col-1||j==row-1)
			 {
				 System.out.print(a[i][j]+"\t");
				 sum=sum+a[i][j];
				}
			 else
			 {
				 System.out.print("\t");
			}
			 }
			System.out.println("");
			}
		
		System.out.println("Sum of boundary elements="+sum);
	}

}
