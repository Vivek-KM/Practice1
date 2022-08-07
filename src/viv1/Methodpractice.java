package viv1;

public class Methodpractice {
	
	int a;
	int b;
	int c;
	
	void get(int x,int y,int z) {
		
		a=x;
		b=y;
		c=z;
	}
	void display() {
		System.out.println(a+b+c);
	}

	public static void main(String args[]) {
		
		Methodpractice ab= new Methodpractice();
		ab.get(2, 6, 5);
		ab.display();
	}
}