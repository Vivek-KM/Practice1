package viv1;

public class ConstructorPr {
	
	int a;
	int b;
	int c;
	
	ConstructorPr(int x, int y, int z){
		
		a=x;
		b=y;
		c=z;	
	}

	void sum() {
		
		System.out.println("Sum="+(a+b+c));
	}	
	public static void main(String args[]) {
		
		ConstructorPr aa=new ConstructorPr(4,6,8);
		aa.sum();
	}
}
