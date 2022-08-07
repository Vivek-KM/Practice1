package viv1;
import java.util.Scanner;
public class palindrome {
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n= sc.nextInt();
		
		int sum=0;
		int z,r;
		
		z=n;
		
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(z==sum)
		{
			System.out.println("Palindrome");}
			else
			{
				System.out.println("Not Palindrome");
			}
		}
	}
