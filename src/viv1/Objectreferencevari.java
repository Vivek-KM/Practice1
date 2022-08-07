package viv1;

public class Objectreferencevari {
	
	int ID;
	String name;
	double salary;
	
	void display()
	{
		System.out.println(ID+" "+name+" "+salary);
	}
	
	public static void main(String args[]) {
		
		Objectreferencevari ab=new Objectreferencevari();
		ab.ID= 24;
		ab.name="Vivek";
		ab.salary=30000.00;
		ab.display();
	}
	
	

}
