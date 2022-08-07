package viv1;

public class Primenum {
	
	public static void main(String args[]) {
		
		int i, a=0, b=0;
		int n=6;
		
		a=n/2;
		
		if(n==0||n==1)
		{
			System.out.println(n+" "+"is not prime number");
		}
		else
		{
			for(i=2;i<=a;i++)
			{
			if(n%i==0) {
				System.out.println(n+" "+"is not prime number");
			b=1;
			break;
			}
			}
			if(b==0)
				System.out.println(n+" " +"is prime number ");
		}
	}

}
