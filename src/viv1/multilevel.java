package viv1;

class A
{
	int a;
	
	void A1()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int b;
	void A2()
	{
		System.out.println(b);
	}
}
class C extends B
{
	int c;
	void A3()
	{
		
		System.out.println(c);
	}
}
public class multilevel {
	
	public static void main(String args[])
	{
		C aa= new C();
		aa.a=2;
		aa.b=5;
		aa.c=6;
		aa.A3();
		aa.A1();
		aa.A2();
	}

}
