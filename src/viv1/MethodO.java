package viv1;

public class MethodO {
	
	int a;
	int b;
	int c;
	
	void m1(int x, int y)
	{
		a=x;
		b=y;
	}
	void m1(int x, int y, int z)
	{
		a=x;
		b=y;
		c=z;
	}
	void dis()
	{
		System.out.println(a+b);
		System.out.println(a+b+c);
	}

	public static void main(String args[]) {
		
		MethodO vv= new MethodO();
		vv.m1(2, 3, 6);
		vv.dis();
	}
}
