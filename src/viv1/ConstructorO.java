package viv1;

public class ConstructorO {
	
	int  a;
	int b;
	int c;
	
	ConstructorO(int x, int y)
	{
		a=x;
		b=y;
	}
   ConstructorO(int x, int y, int z)
   {
	   a=x;
	   b=y;
	   c=z;
   }
   void v()
   {
	   System.out.println(a+b);
	   System.out.println(a+b+c);   
   }
   
   public static void main(String args[]) {
	   
	   ConstructorO aa= new ConstructorO(4,8,6);
	   aa.v();
	   
	   
   }
}
