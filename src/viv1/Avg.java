package viv1;

import java.util.Scanner;
public class Avg {
	
	public static void main(String args[]) {
		
		System.out.println("Enter the number");
		
		Scanner  sc= new Scanner(System.in);
		int m=sc.nextInt();
		
		int r;
		int large=0;
		int small=20;
		
		while(m>0)
		{
			r=m%10;
			m=m/10;
			
			if(r>1 && r%2==0 && r>large)
			{
				large=r;
			}
			if(r>1 && r%2==0 && r<small)
			{
				small=r;
			}
			
		}
		
		 System.out.println(" Largest even="+ large);
		 System.out.println(" Smallest even="+ small);
		 
		 int avg= (large+small)/2;
		 
		 System.out.println("Avg of largest even & smallest even=" +avg);
	}

}
