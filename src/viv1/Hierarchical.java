package viv1;

class X
{
	int x;
	void M1()
	{
		System.out.println(x);
	}
}
class Y extends X
{
	int y;
	void M2()
	{
		System.out.println(y);
	}
}
class Z extends X
{
	int z;
	void M3()
	{
		System.out.println(z);
	}
}
public class Hierarchical {
	
	public static void main (String args[]) {
		
		Y aa= new Y();
		aa.x=10;
		aa.y=20;
		aa.M1();
		aa.M2();
		
		Z bb= new Z();
		bb.z=30;
		bb.M3();
	}

}
