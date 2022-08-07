package viv1;

import java.util.Scanner;
public class Matrixdiagonal {
	
public static void main(String args[]) {
	
	Scanner sc= new Scanner(System.in);
	int i,j,sum=0; 
	int sum1=0;
	int sum2=0;
    
    System.out.println("Enter the row");
     int  row=sc.nextInt();
     System.out.println("Enter the column");
     int  col=sc.nextInt();
     
     int mat[][]= new int [row][col];
	System.out.println("Enter the matrix");
	
	for( i=0;i<row; i++)
	{
		for ( j=0; j<col;j++)
		{
		   mat[i][j]= sc.nextInt();
		}}
	
	System.out.println("The matrix is:");
	
	for(i=0;i<row;i++)
	{
		for (j=0;j<col;j++)
		{
	 System.out.print(mat[i][j]+"\t");
		}
		System.out.println("");
	}
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{

	if(i==j)
	{
	  sum= sum+ mat[i][j];
	}
		
	if(j==i+1)
	{
		sum1= sum1+mat[i][j];
	}
    if(j==i-1)
    {
    	sum2=sum2+mat[i][j];
    }
		}}
	
	 System.out.println(" Sum of the main diagonal elements:" +sum);
	 System.out.println(" Sum of the 2nd diagonal selememts:"+sum1);
	 System.out.println(" Sum of the 3rd diagonal elements:"+sum2);
	 
	 
}
}